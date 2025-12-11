public class Day22 {

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (nums[mid] == target) {
                ans = mid;
            }
        }

        return ans;
    }

    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (nums[mid] == target) {
                ans = mid;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
