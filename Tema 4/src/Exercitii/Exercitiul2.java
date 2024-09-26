package Exercitii;

public class Exercitiul2 {
    public static  void main(String[] args) {
        // Se da urmatorul array
        // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

        // Separati arry-uul dat in 2

        int[] initialArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenNumbers = new int[10];
        int[] addNumbers = new int[10];

        int initialArraySize = initialArray.length;
        System.out.println("Marimea array-ului initial este: " + initialArraySize);

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] % 2 == 0) {
                evenNumbers[i] = initialArray[i];
            } else {
                addNumbers[i] = initialArray[i];
            }
        }
        System.out.println("Numerele impare sunt ");
        for (int number : evenNumbers) {
            System.out.println(number + " ");

        }
        System.out.println();

        System.out.println("Numerele pare sunt: ");
        for (int number : addNumbers) {
            System.out.println(number + " ");
        }
    }
}
