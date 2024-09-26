package Curs13;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}




