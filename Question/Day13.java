public class Day13 {

    // Actual LeetCode solution method
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{}; 
    }

    // Main method for running in VS Code
    public static void main(String[] args) {
        Day13 obj = new Day13();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
