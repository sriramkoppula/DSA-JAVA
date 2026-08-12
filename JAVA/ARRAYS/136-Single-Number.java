class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int exor = nums[0];

        for (int i = 1; i < n; i++) {
            exor = exor ^ nums[i];
        }

        return exor;
    }
}