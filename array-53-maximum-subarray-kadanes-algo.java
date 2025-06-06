class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];

            ans = Math.max(ans, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }
}
