package Exercitii;

public class Exercitiul4 {
    public static void main(String[] args) {
        int[] my1DArray={5,7,6,4,2};
        int sum=0;
        int average=0;
        for(int i = 0;i<5;i++){
            sum=sum+my1DArray[i];
            average=sum/my1DArray[i];
        }
        System.out.print(average);
    }
}
