import java.util.*;

public class Day35 {

    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        k--; // convert to 0-based index

        while (left <= right) {
            int pivot = nums[right];
            int i = left;

            // Partition: elements > pivot on the left
            for (int j = left; j < right; j++) {
                if (nums[j] > pivot) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }

            // Place pivot at correct position
            int temp = nums[i];
            nums[i] = nums[right];
            nums[right] = temp;

            if (i == k) return nums[i];
            if (i < k) left = i + 1;
            else right = i - 1;
        }
        return -1;
    }

    // ✅ MAIN method for VS Code / Terminal testing
    public static void main(String[] args) {
        Day35 obj = new Day35();

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(obj.findKthLargest(nums, k)); // Output: 5
    }
}
