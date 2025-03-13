import java.util.Arrays;
public class zad3 {
    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0 || positions % n == 0) return array;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + positions) % n;
            rotatedArray[newIndex] = array[i];
        }
        return rotatedArray;
    }
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7};
        int[] test2 = {1, 2, 3};
        System.out.println(Arrays.toString(rotateArray(test1, 2)));
        System.out.println(Arrays.toString(rotateArray(test2, 3)));
    }
}