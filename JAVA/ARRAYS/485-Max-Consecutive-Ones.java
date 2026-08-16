class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int curr = 0;

        for (int n : nums) {
            if (n == 1) {
                curr++;
            } else {
                maxcount = Math.max(maxcount, curr);
                curr = 0;
            }
        }

        return Math.max(maxcount, curr);
    }
}