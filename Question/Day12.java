import java.util.*;

public class Day12 {
    public static void main(String[] args) {
        // Sample input to test in VS Code
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        while (left <= right) {
            int lsq = nums[left] * nums[left];
            int rsq = nums[right] * nums[right];

            if (lsq > rsq) {
                ans[idx] = lsq;
                left++;
            } else {
                ans[idx] = rsq;
                right--;
            }
            idx--;
        }

        return ans;
    }
}
