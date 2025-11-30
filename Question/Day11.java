public class Day11 {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // For testing in VS Code (optional)
    public static void main(String[] args) {
        Day11 obj = new Day11();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = obj.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
