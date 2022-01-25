/*
1) Você foi encarregado de implementar uma classe em Java que represente uma contagem de
tempo com hora, minuto e segundo. Por exemplo, a contagem 03:10:40 representa 3 horas, 10
minutos e 40 segundos. O integrante da equipe que pediu a implementação dessa classe
solicitou que os dados da classe possam ser alterados separadamente, ex.: alterar a hora
independentemente dos minutos. Além disso, uma das solicitações é que dois objetos tempo
possam ser somados, o que resulta em um novo objeto cuja tempo é a soma dos tempos dos
objetos envolvidos. Por exemplo, dado a contagem 02:34:10 (2 horas, 34 minutos e 10 segundos)
e a contagem 00:06:42 (zero horas, 6 minitos e 42 segundos), se fossem somados, resultariam
num novo objeto de contagem de tempo cujos valores seriam 02:40:52 (2 horas, 40 minutos e 52
segundos). Outras solicitações são que uma contagem de tempo possa ter subtraída de outra
contagem, e que seja possível calcular quantos dias uma contagem representa, ex.: 48:00:01
representa 2 dias (24 horas por dia, então 48 horas significa 2 dias)
*/

public class Exe1 {
    public static void main(String args[]) {
        DateTime d1 = new DateTime(12, 40, 10);
        DateTime d2 = new DateTime(15, 15, 5);

        System.out.println(d1.toString());
        System.out.println(d2.toString());

        DateTime d3 = DateTime.sub(d1, d2);
        DateTime d4 = DateTime.sum(d1, d2);

        System.out.println(d3.toString());
        System.out.println(d4.toString());

        System.out.println("d3 em Dias: " + d3.getDays());
        System.out.println("d4 em Dias: " + d4.getDays());
    }
}

class DateTime {
    private int hour;
    private int minute;
    private int second;

    public DateTime() {
    }

    public DateTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static DateTime sum(DateTime d1, DateTime d2) {
        int sumMinutesD1 = d1.getSecond() + d1.getMinute() * 60 + d1.getHour() * 60 * 60;
        int sumMinutesD2 = d2.getSecond() + d2.getMinute() * 60 + d2.getHour() * 60 * 60;

        int hours = (sumMinutesD1 + sumMinutesD2) / (60 * 60);
        int minutes = ((sumMinutesD1 + sumMinutesD2) % (60 * 60)) / 60;
        int seconds = ((sumMinutesD1 + sumMinutesD2) % (60 * 60)) % 60;

        return new DateTime(hours, minutes, seconds);
    }

    public static DateTime sub(DateTime d1, DateTime d2) {
        int sumMinutesD1 = d1.getSecond() + d1.getMinute() * 60 + d1.getHour() * 60 * 60;
        int sumMinutesD2 = d2.getSecond() + d2.getMinute() * 60 + d2.getHour() * 60 * 60;

        int hours = Math.abs((sumMinutesD1 - sumMinutesD2) / (60 * 60));
        int minutes = Math.abs(((sumMinutesD1 - sumMinutesD2) % (60 * 60)) / 60);
        int seconds = Math.abs(((sumMinutesD1 - sumMinutesD2) % (60 * 60)) % 60);

        return new DateTime(hours, minutes, seconds);
    }

    public int getDays() {
        int days = this.hour / 24;
        return days;
    }

    public String toString() {
        String hour = StringHelper.str_pad(Integer.toString(this.hour), 2, "0", "STR_PAD_LEFT");
        String minute = StringHelper.str_pad(Integer.toString(this.minute), 2, "0", "STR_PAD_LEFT");
        String second = StringHelper.str_pad(Integer.toString(this.second), 2, "0", "STR_PAD_LEFT");

        return hour + ":" + minute + ":" + second;
    }
}

class StringHelper {
    public static String str_pad(String input, int length, String pad, String sense) {
        int resto_pad = length - input.length();
        String padded = "";

        if (resto_pad <= 0) {
            return input;
        }

        if (sense.equals("STR_PAD_RIGHT")) {
            padded = input;
            padded += _fill_string(pad, resto_pad);
        } else if (sense.equals("STR_PAD_LEFT")) {
            padded = _fill_string(pad, resto_pad);
            padded += input;
        } else // STR_PAD_BOTH
        {
            int pad_left = (int) Math.ceil(resto_pad / 2);
            int pad_right = resto_pad - pad_left;

            padded = _fill_string(pad, pad_left);
            padded += input;
            padded += _fill_string(pad, pad_right);
        }
        return padded;
    }

    protected static String _fill_string(String pad, int resto) {
        boolean first = true;
        String padded = "";

        if (resto >= pad.length()) {
            for (int i = resto; i >= 0; i = i - pad.length()) {
                if (i >= pad.length()) {
                    if (first) {
                        padded = pad;
                    } else {
                        padded += pad;
                    }
                } else {
                    if (first) {
                        padded = pad.substring(0, i);
                    } else {
                        padded += pad.substring(0, i);
                    }
                }
                first = false;
            }
        } else {
            padded = pad.substring(0, resto);
        }
        return padded;
    }
}