package functional;

@FunctionalInterface
public interface MyFunctionalInterface {
    void sayHello(String Hello);

    default void sayBye() {
        System.out.println("Bye");

    }


}
