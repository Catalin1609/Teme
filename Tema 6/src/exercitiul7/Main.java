package exercitiul7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {

        Consumer<String> consumar = (s) -> System.out.println(s);
        consumar.accept("Hellow world");

        Random random = new Random();
        Supplier<Integer[]> supplier = () -> {
            Integer[] integers = new Integer[10];
            for (int i = 0; i < integers.length; i++) {
                integers[i] = random.nextInt(100);
            }
            return integers;
        };
        Integer[] integers = supplier.get();
        System.out.println("Random integers: " + Arrays.toString(integers));


        Function<String, Integer> function = s -> {
            if (s != null && !s.isEmpty()) {
                return s.length();
            } else {
                return 0;
            }
        };
        System.out.println(function.apply("Hello world!"));
        System.out.println(function.apply(""));

        ToIntFunction<String> toIntFunction = s -> {
            if (s != null && !s.isEmpty()) {
                return s.length();
            } else {
                return 0;
            }
        };
        System.out.println(toIntFunction.applyAsInt("Hello world!"));
        System.out.println(toIntFunction.applyAsInt(""));


        List<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);

        Consumer<List<Integer>> intConsumer = new Consumer<>() {
            @Override
            public void accept(List<Integer> integers) {
                for (Integer integer : integers) {
                    System.out.println(integer);
                }
            }
        };
        intConsumer.accept(integers1);
    }
}
