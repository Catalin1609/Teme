/*
package Crus11;

import java.util.Scanner;

public class Palindrom {
    public static boolean Palindrom(int num) {
        // Metoda care verifică dacă un număr este palindrom
        public static boolean Palindrom (int num){
            int originalNum = num;
            int reversedNum = 0;

            // Inversăm numărul
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            // Verificăm dacă numărul original este egal cu numărul inversat
            return originalNum == reversedNum;
        }

        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            // Citim numărul de la tastatură
            System.out.print("Introdu un număr: ");
            int number = scanner.nextInt();

            // Verificăm dacă numărul este palindrom și afișăm rezultatul
            if (Palindrom(number)) {
                System.out.println(number + " este un număr palindrom.");
            } else {
                System.out.println(number + " nu este un număr palindrom.");
            }

            // Inchidem scannerul
            scanner.close();
        }
    }
}
*/
