class Solution {
    public int removeDuplicates(int[] nums) {
        // Two pointers approach
        int i = 0, j = 0;
        int n = nums.length;

        while (i < n && j < n) {
            // we will find the position which is not equal to ith index element 
            // once we find such element let's put that in i + 1 position and increment the i
            // else keep incrementing the j
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }

            j++;
        }

        // once we traverse the full array - our i will be at the last index of where unique values end so let's return i + 1 as the length
        return i + 1;
    }
}
