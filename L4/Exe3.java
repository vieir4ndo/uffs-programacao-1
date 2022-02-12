/*
3) Dadas as classes:
d) Com base no método criado na questão a), o que aparecerá na saída padrão se o código abaixo for executado com
valuetendo valor 90? Justifique.

*/

public class Exe3 {
    public static void main(String args[]) {
        try {
            /*
             * b) Com base no método criado na questão a), o que aparecerá na saída padrão
             * se o código abaixo for executado com
             * valuetendo valor 1? Justifique.
             */
            // IMPRIME WIRELESS EXCEPTION, pois captura primeiro pelo pai
            // int value = 1;

            /*
             * c) Com base no método criado na questão a), o que aparecerá na saída padrão
             * se o código abaixo for executado com
             * valuetendo valor 2? Justifique.
             */
            // IMPRIME ETHERNET EXCEPTION, pq essa é a exception disparada no catch
            // int value = 2;

            // IMPRIMIRÁ APENAS O FINALLY
            int value = 90;

            makeConnection(value);
        } catch (ChecksumException x1) {
            System.out.println("exception ChecksumException ");
        } catch (WirelessException x2) {
            System.out.println("exception WirelessException ");
        } catch (EthernetException x3) {
            System.out.println("exception EthernetException ");
        } catch (NetworkException x4) {
            System.out.println("exception NetworkException ");
            // CÓDIGO COMENTADO POIS ESSA EXCEPTION JÁ É CAPTURA POR SEU PAI WIRELESS E
            // NETWORK
            // } catch (LostSignalException x5) {
            // System.out.println("exception LostSignalException ");
        } finally {
            System.out.println("closing connection");
            // comentado pois nao compila assim..., mas eu saquei que ele nao imprimiria a
            // parte do flushing...
            // return;
            System.out.println("flushing log...");
        }
    }

    /*
     * a) Escreva um método chamado makeConnection()que receba um inteiro como
     * parâmetro e retorne um inteiro
     * que equivale ao dobro do valor do parâmetro. Se o valor do parâmetro for 0 o
     * método deve levantar uma
     * ChecksumException, se for 1 deve levantar uma LostSignalException, se for 2
     * deve levantar uma
     * EthernetException, se for 3 deve levantar uma WirelessException, se for 4
     * deve levantar uma
     * NetworkException, caso contrário não levanta exceções.
     */

    public static int makeConnection(int i) throws NetworkException {
        switch (i) {
            case 0:
                throw new ChecksumException();
            case 1:
                throw new LostSignalException();
            case 2:
                throw new EthernetException();
            case 3:
                throw new WirelessException();
            case 4:
                throw new NetworkException();
        }

        return i * 2;
    }
}

class NetworkException extends Exception {
}

class WirelessException extends NetworkException {
}

class EthernetException extends NetworkException {
}

class LostSignalException extends WirelessException {
}

class ChecksumException extends WirelessException {
}
