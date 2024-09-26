package Curs12;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți un număr pentru a verifica dacă există în listă:");
        int numberToCheck = scanner.nextInt();

        if (numberList.contains(numberToCheck)) {
            System.out.println("Numărul " + numberToCheck + " există în listă.");
        } else {
            System.out.println("Numărul " + numberToCheck + " nu există în listă.");
        }
        scanner.close();
    }
}
