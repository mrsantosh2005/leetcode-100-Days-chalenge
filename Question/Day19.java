public class Day19 {

    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currSum += nums[i];
            } else {
                currSum = nums[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    // Main method to run in VS Code
    public static void main(String[] args) {
        Day19 sol = new Day19();

        int[] nums = {10, 20, 30, 5, 10, 50};
        int result = sol.maxAscendingSum(nums);

        System.out.println("Maximum Ascending Subarray Sum: " + result);
    }
}
