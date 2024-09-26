package Exercitii;

public class Exercitiul3 {
    public static void main(String[] args) {
        //Sa se afiseze un patrat cu 100 de elemente (10 linii si 10 coloane)
        //cu caracterul *
        int row=10;
        int columns=10;
        char[][] matrix =new char[row][columns];
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]='*';
            }
        }
        for(int i = 0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }


    }
}
