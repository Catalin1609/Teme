package Exercitii;

public class Exercitiul6 {
    public static void main(String[] args) {
        int[] my_array={1,3,4,6,7};
        int searchValue=4;
        int index =-1;//Se initializeaza indexul cu -1 (nu s-a gasit niciun element)
        for(int i=0;i< my_array.length;i++){
            if(my_array[i]==searchValue){
                index=i;
                break;
            }
        }
        if(index !=-1){
            System.out.print("Indexul numarului "+searchValue+ " este :"+index);
        }
    }
}
