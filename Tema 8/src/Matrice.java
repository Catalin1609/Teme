public class Matrice {
    public static void main(String[] args) {
        int[][] matrix = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9} };
        System.out.println(matrix[2][1]);

        for (int[] i : matrix) {
            System.out.println(i);
        }

    }
}
