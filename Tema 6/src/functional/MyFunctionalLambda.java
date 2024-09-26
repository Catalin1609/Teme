package functional;

public class MyFunctionalLambda {
    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface = (s) -> System.out.println("Hello");

        myFunctionalInterface.sayHello("something");

    }
    static class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
        @Override
        public void sayHello(String hello) {
            System.out.println(hello);
        }
        public void saySomething(String something) {
            System.out.println(something);;
        }
    }

}
