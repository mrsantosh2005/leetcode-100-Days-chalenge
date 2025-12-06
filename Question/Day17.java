public class Day17 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, h * width);

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    // Main method for running in VS Code
    public static void main(String[] args) {
        Day17 sol = new Day17();
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(sol.maxArea(arr)); // Output: 49
    }
}
