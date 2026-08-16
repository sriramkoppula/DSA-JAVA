import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        HashSet<Integer> list1 = new HashSet<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                list1.add(num);
            }
        }

        int[] arr = new int[list1.size()];
        int index = 0;

        for (int num : list1) {
            arr[index++] = num;
        }

        return arr;
    }
}