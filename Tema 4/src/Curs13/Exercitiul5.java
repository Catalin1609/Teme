package Curs13;
import java.util.ArrayList;

public class Exercitiul5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        String searchColor = "Blue";

        boolean found = colors.contains(searchColor);
        if (found) {
            System.out.println(searchColor + " is found in the list.");
        } else {
            System.out.println(searchColor + " is not found in the list.");
        }
    }
}
