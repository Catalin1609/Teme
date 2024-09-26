package Curs12;
import java.util.ArrayList;
import java.util.HashSet;

public class Exercitiul1 {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();

        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(40);
        numberSet.add(50);

        ArrayList<Integer> numberList = new ArrayList<>(numberSet);

        System.out.println("Elementele din lista sunt:");
        for (Integer number : numberList) {
            System.out.println(number);
        }
    }
}

