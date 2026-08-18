class Solution {
    public int maxProduct(int[] nums) {
        // 연속된 수열의 곱하기에서 가장 큰 값을 구하시오.
        int max = nums[0];
        int min = nums[0];
        int best = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];

            int newMax = Math.max(n, Math.max(max * n, min * n));
            int newMin = Math.min(n, Math.min(max * n, min * n));

            max = newMax;
            min = newMin;
            best = Math.max(best, max);
        }

        return best;
    }
}
