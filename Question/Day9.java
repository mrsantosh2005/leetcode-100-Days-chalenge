public class Day9 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int totalLeft = (m + n + 1) / 2;

        int left = 0, right = m;

        while (left < right) {
            int i = (left + right) / 2;
            int j = totalLeft - i;

            if (i < m && nums1[i] < nums2[j - 1]) {
                left = i + 1;
            } else {
                right = i;
            }
        }

        int i = left;
        int j = totalLeft - i;

        int nums1LeftMax = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
        int nums2LeftMax = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
        int leftMax = Math.max(nums1LeftMax, nums2LeftMax);

        if ((m + n) % 2 == 1) {
            return leftMax;
        }

        int nums1RightMin = (i == m) ? Integer.MAX_VALUE : nums1[i];
        int nums2RightMin = (j == n) ? Integer.MAX_VALUE : nums2[j];
        int rightMin = Math.min(nums1RightMin, nums2RightMin);

        return (leftMax + rightMin) / 2.0;
    }

    // For testing in VS Code (optional)
    public static void main(String[] args) {
        Day9 obj = new Day9();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
