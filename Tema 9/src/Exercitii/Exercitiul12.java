package Exercitii;

public class Exercitiul12 {
    public static void main(String[] args) {
        int[] myArray={1,3,2,5,12,16,5};
        int x =-1;
        for(int i=0;i< myArray.length;i++) {
            for (int j = i + 1; j < myArray.length;j++) {
                if (myArray[i] == myArray[j]) {
                    x = i;
                    break;
                }

            }
            if (x != -1) {
                break;
            }
        }
        if(x !=-1){
            System.out.print("Numarul "+ myArray[x]+ " Are duplicat ");

        }
    }
}
