package functional;

public class Main {
    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface = (MyFunctionalInterface) (s) -> {
            System.out.println("Hello");
        };

//        myFunctionalInterface.sayHello();

//        MyFunctionalInterface myFunctionalInterface2 = () -> {
//            System.out.println("Hello");
//            System.out.println("Bye");
//        };
    }


}
