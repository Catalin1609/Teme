package Curs13;
import java.util.HashMap;
import java.util.Map;

public class Exercitiul9 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);
        ageMap.put("David", 28);

        System.out.println("Map entries using for loop:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
