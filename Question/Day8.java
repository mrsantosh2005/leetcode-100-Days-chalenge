public class Day8 {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int n : nums) {
            if (n >= max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }

    // For testing in VS Code
    public static void main(String[] args) {
        Day8 obj = new Day8();
        int[] nums = {3, 4, 5, 2};
        System.out.println(obj.maxProduct(nums)); // Output: 12
    }
}
