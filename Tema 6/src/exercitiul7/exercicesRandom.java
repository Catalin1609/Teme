package exercitiul7;

import java.util.Random;
import java.util.function.Supplier;

public class exercicesRandom {
    public static void main(String[] args) {

        Random random = new Random();
        Supplier<Integer> randomInt = () -> random.nextInt(100);

        Integer randomIntValue = randomInt.get();
        System.out.println(randomIntValue);
    }
}
