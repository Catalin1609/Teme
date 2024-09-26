package Curs13;
import java.util.LinkedList;

public class Exercitiul7 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("List before insertion: " + colors);

        String newColor1 = "Orange";
        String newColor2 = "Pink";
        int position = 2;

        colors.add(position, newColor1);
        colors.add(position + 1, newColor2);

        System.out.println("List after insertion: " + colors);
    }
}
