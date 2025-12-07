public class Day18 {

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;          // update smallest
            } else if (n <= second) {
                second = n;         // update second smallest
            } else {
                // found n > second > first --> triplet exists
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Day18 sol = new Day18();

        int[] nums = {1, 2, 3, 1, 0};
        boolean result = sol.increasingTriplet(nums);

        System.out.println(result);  // true
    }
}
