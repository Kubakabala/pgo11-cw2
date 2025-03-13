import java.util.HashMap;
import java.util.Map;
public class zad2 {
    public static int findDominant(int[] array) {
        int n = array.length;
        int threshold = n / 2;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > threshold) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] test1 = {3, 3, 3, 2, 2};
        int[] test2 = {1, 2, 3, 4, 5};
        int[] test3 = {5, 5, 5, 1, 9};
        System.out.println(findDominant(test1));
        System.out.println(findDominant(test2));
        System.out.println(findDominant(test3));
    }
}
