package Curs13;
import java.util.LinkedList;
import java.util.List;

public class Exercitiul6 {
    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("List before insertion: " + colors);
        String newColor = "Orange";
        colors.addFirst(newColor);
        System.out.println("List after insertion: " + colors);
    }
}
