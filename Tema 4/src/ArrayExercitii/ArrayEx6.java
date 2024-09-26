package ArrayExercitii;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int indexArray = 30;
        int index = findIndex(array, indexArray);
        if (index != -1) {
            System.out.println("Elementul " + indexArray + " a fost gasit la indexul:  " + index);
        } else {
            System.out.println("Elementul " + indexArray + " nu a fost gasit in array ");
        }
    }

    public static int findIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return  -1;
    }

}
