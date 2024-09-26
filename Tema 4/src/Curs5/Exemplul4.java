package Curs5;

public class Exemplul4 {

    /*
    * Scrieti o metoda care returneaza minimul dintre 3 numere
    *
    *
    *  1, 3, 5 -> afiseaza 1
    *  -1, -2, -3 -> afiseaza -3
    *  0, 0, 0 -> afiseaza 0
    *  0, 0, 1 -> afiseaza 0
    *
    * */

    public static int minimNum(int a, int b, int c) {
        int minim = a;
        if (b < minim) {
            minim = b;
        }
        if (c < minim) {
            minim = c;
        }
        return minim;
    }

    public static void main(String[] args) {
        int num1 = -1;
        int num2 = -2;
        int num3 = -3;

        int minim = minimNum(num1, num2, num3);
        System.out.println("Minimul dintre " + num1 + ", " + num2 + " si " + num3 + " este: " + minim);
    }


}
