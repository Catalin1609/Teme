package Curs5;

public class Exemplu5 {

    /*
    * Scrieti o metoda care intoarce media artimetica dintr-un array
    *
    * {1, 2, 3} -> 2
    * {2, 2, 2} -> 2
    * */
    public static double calculAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int numar : array) {
            suma += numar;
        }
        return (double) suma / array.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
    double media = calculAverage(array);
    System.out.println("Media este " + media);

    }
}
