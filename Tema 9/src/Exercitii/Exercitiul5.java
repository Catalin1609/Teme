package Exercitii;

import java.util.Scanner;

public class Exercitiul5 {
    public static void main(String[] args) {
        int [] my1DArray={1,4,6,7,8,19};
        System.out.print("Valoare este :");
        Scanner scanner=new Scanner(System.in);
        int mySpecificValue= scanner.nextInt();
        boolean itemContain=false;
        for(int n:my1DArray){
            if(n == mySpecificValue){
                itemContain=true;
                break;
            }
        }
        if(itemContain){
            System.out.print("Valoarea " +mySpecificValue +  " Se afla in array ");
        }
        else{
            System.out.print("Valoarea "+mySpecificValue+" Nu se afla in array");
        }


    }
}
