package Curs5;

public class Metode {

    public static void displayNumber(int number) {
        System.out.println(("se afiseaza: " + number));
    }

    // metoda overloading
    public static void displayVariable(boolean booleanVariable) {
        System.out.println("afisez boolean-ul; " + booleanVariable);
    }

    public static void main(String[] args) {
        int x = 3;
        boolean myExample = true;


        displayNumber(2);
        displayVariable(myExample);
    }
}
