import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 1, 2};
        int target = 4;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum - target)) {

                int length = i - map.get(sum - target);

                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(maxLength);
    }
}