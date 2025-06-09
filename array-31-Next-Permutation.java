class Solution {
    public void nextPermutation(int[] nums) {
        // Brute Force approach - TC: O  (N! x N)
        // First generate all the possible permutations
        // Linear search
        // next index

        // Another Solution is more efficient for TC: O(N), SC: O(1)
    
        // First find the "break point" (first decreasing element from right)
        int idx = -1; // Initialize idx to -1 (signifies no break point found)
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // if we don't find such break point that means it's true decreasing array and the next permuation will be the first combination 
        // and that's why we reverse the whole array
        if (idx == -1) {
            reverseArr(nums, 0, n - 1); // Reverse the entire array
        } else { // This 'else' block ensures this logic only runs if idx is NOT -1
            for (int i = n - 1; i > idx; i--) {
                if (nums[i] > nums[idx]) { // Found the smallest element greater than nums[idx]
                    // Perform the swap
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break; // Stop after the first swap
                }
            }

            reverseArr(nums, idx + 1, n - 1);            
        }

    }

    public void reverseArr(int[] arr, int start, int end) {
        int left = start;
        int right = end;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
