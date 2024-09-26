package Curs13;
import java.util.HashMap;
import java.util.Map;

public class Exercitiul8 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println(ageMap);

        ageMap.put("David", 28);

        System.out.println(ageMap);
    }
}
