import java.util.ArrayList;
import java.util.List;
public class Main {
    public static int[] filterEvenIndexOddValue(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                resultList.add(array[i]);
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] test2 = {2, 3, 4, 5, 6, 7};
        int[] test3 = {7, 8, 9, 10, 11};
        System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(test1)));
        System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(test2)));
        System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(test3)));
    }
}