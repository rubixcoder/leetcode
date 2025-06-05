class Solution {
    public boolean check(int[] nums) {
        int x = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                if (x == 0) {
                    x = i + 1;
                } else return false;
            }
        }

        if (x > 0) {
            return (nums[nums.length - 1] > nums[0]) ? false : true;
        }

        return true;
    }
}
