package Curs12;
import java.util.HashSet;

public class Exercitiul3 {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(40);
        numberSet.add(50);
        numberSet.add(20);
        numberSet.add(30);

        System.out.println("Elementele unice din set sunt:");
        for (Integer number : numberSet) {
            System.out.println(number);
        }
    }
}
