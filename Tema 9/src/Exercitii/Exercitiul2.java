package Exercitii;

public class Exercitiul2 {
    public static void main(String[] args) {
        //Se da urmatorul array
        //{1,2,3,4,5,6,7,8,9,10}

        //Separati array-ul dat in doua array-uri unidimensionale separate

        //Primul array va contine numere pare

        //Al doilea va contine doar nuemerele impare

        int[] myInitialArray={1,2,3,4,5,6,7,8,9,10};
        int[] myEvenNumbers= new int[10];
        int[] myNotEvenNumbers=new int [10];
        int initialArray=myInitialArray.length;
        for (int i = 0;i<initialArray;i++) {
            if (myInitialArray[i] % 2 == 0) {
                myEvenNumbers[i] = myInitialArray[i];
            } else {
                myNotEvenNumbers[i] = myInitialArray[i];
            }
        }
        System.out.println("Numerele pare sunt :" );
        for (int number : myEvenNumbers){
            System.out.print(number);
        }
        System.out.println("Numerele impare sunt :");
        for (int number : myNotEvenNumbers){
            System.out.print(number);
        }
    }
}
