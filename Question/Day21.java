public class Day21 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            }

            if (nums[mid] < target) {
                left = mid + 1; // go right
            } else {
                right = mid - 1; // go left
            }
        }

        return -1; // not found
    }

    // Run in VS Code
    public static void main(String[] args) {
        Day21 sol = new Day21();

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(sol.search(nums, target)); // Output: 4
    }
}
