/*
2) Utilizando os mesmos requisitos da questão 1), implemente para a sua classe métodos para
que, dado uma contagem de tempo, ela também tenha o atributo dias, ex: 02:14:45:10 (2 dias,
14 horas, 45 minutos e 10 segundos). 
Nessa classe, é possível que uma contagem de tempo possa ser avançada em uma certa quantidade de dias. Por exemplo, dado o instante 00:01:04:12 (zero dias, uma hora, 4 minutos e 12 segundos), se ele for avançado em 2.5 dias (que é o equivalente a 60 horas), a contagem passará a ser 02:13:04:12 (dois dias, 13 horas, 4 minutos e 12 segundos). 
Nessa nova implementação da classe, o valor máximo do atributo hora é 23 (porque 24 horas implica 1 dia e zero horas, ou 01:00:00:00).
*/

public class Exe2 {
    public static void main(String args[]) {
        DateTime d1 = new DateTime(2, 14, 45, 10);
        System.out.println(d1.toString());

        DateTime d2 = new DateTime(0, 1, 4, 12);
        System.out.println(d2.toString());
        d2.addDays(2.5);
        System.out.println(d2.toString());
    }
}

class DateTime {
    private int day;
    private int hour;
    private int minute;
    private int second;

    public DateTime() {
    }

    public DateTime(int days, int hour, int minute, int second) {
        this.day = days;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setDay(int days) {
        this.day = days;
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

    public int getDay() {
        return this.day;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static DateTime sum(DateTime d1, DateTime d2) {
        int sumMinutesD1 = d1.getSecond() + d1.getMinute() * 60 + d1.getHour() * 60 * 60 + d1.getDay() * 86400;
        int sumMinutesD2 = d2.getSecond() + d2.getMinute() * 60 + d2.getHour() * 60 * 60 + d2.getDay() * 86400;

        int days = ((sumMinutesD1 + sumMinutesD2)) / (86400);
        int hours = (((sumMinutesD1 + sumMinutesD2)) % (86400)) / (60 * 60);
        int minutes = ((sumMinutesD1 + sumMinutesD2) % (60 * 60)) / 60;
        int seconds = ((sumMinutesD1 + sumMinutesD2) % (60 * 60)) % 60;

        return new DateTime(days, hours, minutes, seconds);
    }

    public static DateTime sub(DateTime d1, DateTime d2) {
        int sumMinutesD1 = d1.getSecond() + d1.getMinute() * 60 + d1.getHour() * 60 * 60 + d1.getDay() * 86400;
        int sumMinutesD2 = d2.getSecond() + d2.getMinute() * 60 + d2.getHour() * 60 * 60 + d1.getDay() * 86400;

        int days = Math.abs(((sumMinutesD1 + sumMinutesD2)) / (86400));
        int hours = Math.abs((((sumMinutesD1 + sumMinutesD2)) % (86400)) / (60 * 60));
        int minutes = Math.abs(((sumMinutesD1 - sumMinutesD2) % (60 * 60)) / 60);
        int seconds = Math.abs(((sumMinutesD1 - sumMinutesD2) % (60 * 60)) % 60);

        return new DateTime(days, hours, minutes, seconds);
    }

    public int getDays() {
        int days = this.hour / 24;
        return days;
    }

    public String toString() {
        String day = StringHelper.str_pad(Integer.toString(this.day), 2, "0", "STR_PAD_LEFT");
        String hour = StringHelper.str_pad(Integer.toString(this.hour), 2, "0", "STR_PAD_LEFT");
        String minute = StringHelper.str_pad(Integer.toString(this.minute), 2, "0", "STR_PAD_LEFT");
        String second = StringHelper.str_pad(Integer.toString(this.second), 2, "0", "STR_PAD_LEFT");

        return day + ":" + hour + ":" + minute + ":" + second;
    }

    public void addDays(Double days) {
        int d = (int) Math.floor(days);

        int h = (int) ((days - d) * 24);

        DateTime d1 = new DateTime(d, h, 0, 0);

        DateTime newDateTime = DateTime.sum(this, d1);

        this.setDay(newDateTime.getDay());
        this.setHour(newDateTime.getHour());
        this.setMinute(newDateTime.getMinute());
        this.setSecond(newDateTime.getSecond());
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