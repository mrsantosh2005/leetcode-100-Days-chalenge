public class Day27 {

    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Make mid even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;   // single element on right side
            } else {
                right = mid;     // single element on left side
            }
        }

        return nums[left];
    }

    // Run in VS Code
    public static void main(String[] args) {
        Day27 sol = new Day27();

        int[] nums = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(sol.singleNonDuplicate(nums)); // Output: 2
    }
}
