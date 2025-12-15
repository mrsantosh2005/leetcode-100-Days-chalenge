public class Day26 {

    // LeetCode solution method
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        // left is the correct insert position
        return left;
    }

    // Main method for VS Code execution
    public static void main(String[] args) {
        Day26 sol = new Day26();

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int result = sol.searchInsert(nums, target);
        System.out.println("Insert Position: " + result);
    }
}
