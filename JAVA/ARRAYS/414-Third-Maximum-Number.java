class Solution {
    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == a || num == b || num == c) {
                continue;
            }

            if (num > a) {
                c = b;
                b = a;
                a = num;
            } 
            else if (num > b) {
                c = b;
                b = num;
            } 
            else if (num > c) {
                c = num;
            }
        }

        return c != Long.MIN_VALUE ? (int)c : (int)a;
    }
}