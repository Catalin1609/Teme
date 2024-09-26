package Curs13;
import java.util.ArrayList;

public class Exercitiul3 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();


        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");


        System.out.println("List before insertion: " + colors);


        colors.add(0, "Orange");


        System.out.println("List after insertion: " + colors);
    }
}
