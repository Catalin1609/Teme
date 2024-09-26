package Curs6;

public class Ecercises {

    public static void main(String[] args) {
        String textPar = "aaaaabb"; // Exemplu pentru lungime pară
        String textImpar = "ababab"; // Exemplu pentru lungime impară

        int frecventa;
        if (textPar.length() % 2 == 0) {
            frecventa = calculeazaFrecventa(textPar, 'a');
            System.out.println("Frecvența caracterului 'a' în șirul par este: " + frecventa);
        } else {
            frecventa = calculeazaFrecventa(textImpar, 'b');
            System.out.println("Frecvența caracterului 'b' în șirul impar este: " + frecventa);
        }
    }

    public static int calculeazaFrecventa(String text, char caracter) {
        int frecventa = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == caracter) {
                frecventa++;
            }
        }
        return frecventa;
    }
}