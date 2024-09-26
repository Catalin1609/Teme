package Exercitii;

import java.util.Scanner;

public class Exercitiul1 {
    public static  void main(String[] args) {
        // Scrieti un program care sa returneze suma elementelor
        // unui array unidimensional
       /* int[] myMatrix = {1, 2, 3, 4};
        int suma = calculSuma(myMatrix);
        System.out.println(suma);*/

        // Cititi numarul de elemente al arrayului de la tastatura
        Scanner scanner = new Scanner(System.in);
        // Initializati un array fie cu valori predefinite fie de la tastatura

    System.out.println("Introduceti numarul de elemente: ");
    int size = scanner.nextInt();

    int[] myArray = new int[size];

    for(int i = 0; i< size; i++) {
        System.out.println("introduceti elementul: ");
        myArray[i] = scanner.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < size; i++){
        sum = sum + myArray[i];
    }
    System.out.println("Suma elementelor este: " + sum);

    }
}
