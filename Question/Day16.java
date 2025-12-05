public class Day16 {

    public int dominantIndex(int[] nums) {
        int max = -1, second = -1, idx = -1;

        // Find largest and second largest
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                idx = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }

        // Check if largest is at least twice others
        return max >= 2 * second ? idx : -1;
    }

    // MAIN method for VS Code testing
    public static void main(String[] args) {
        Day16 sol = new Day16();
        int[] nums = {3, 6, 1, 0};
        System.out.println(sol.dominantIndex(nums)); 
    }
}
