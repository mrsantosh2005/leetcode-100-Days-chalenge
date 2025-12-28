import java.util.*;

public class Day33 {

    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Count negatives: first index where nums[i] >= 0
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int neg = left;

        // Count positives: first index where nums[i] > 0
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int pos = n - left;

        return Math.max(neg, pos);
    }

    // ✅ MAIN method for VS Code / Terminal testing
    public static void main(String[] args) {
        Day33 obj = new Day33();

        int[] nums = {-3, -2, -1, 0, 0, 1, 2};
        System.out.println(obj.maximumCount(nums)); // Output: 3
    }
}
