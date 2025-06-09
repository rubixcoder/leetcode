class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> tempArr = new ArrayList<>();

        helper(nums, tempArr, answer);

        return answer;
    }

    public void helper(int[] nums, List<Integer> tempArr, List<List<Integer>> answer) {
        if (tempArr.size() == nums.length) {
            List<Integer> newArr = new ArrayList<>(tempArr);
            answer.add(newArr);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempArr.indexOf(nums[i]) == -1) {
                tempArr.add(nums[i]);
                helper(nums, tempArr, answer);
                tempArr.removeLast();
            }
        }
    }
}
