package palindrom;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> listOfName = List.of("ion", "ana", "david", "casa");
        Optional<String> first = listOfName.stream()
                .filter(Main::isNamePalondrom)
                .findFirst();

        first.ifPresentOrElse(
                name -> System.out.println("First palindrom name is " + name),
                () -> System.out.println("No palindrom name found")
        );
    }

    private static boolean isNamePalondrom(String name) {
        return name != null && name.contentEquals(new StringBuilder(name).reverse());
    }

}
