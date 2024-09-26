package Curs5;

public class Exemplul2 {

    public static void  displayArray(int[] arrayToBeDisplayed) {
        for (int number : arrayToBeDisplayed) {
            System.out.println(number + " ");
        }
    }


    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int number : exampleArray){
            displayArray((exampleArray));
            System.out.println(number);
        }

    }
}
