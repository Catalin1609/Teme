package Crus11;

public class Exercitiul1 {
    public static void main(String[] args) {
        int number = 10;
        if (isPrime(number)) {
            System.out.println(number + " este un număr prim.");
        } else {
            System.out.println(number + " nu este un număr prim.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
