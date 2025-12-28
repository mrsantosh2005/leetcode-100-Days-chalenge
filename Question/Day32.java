import java.util.*;

public class Day32 {

    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sort
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: all zeros
        if (arr[0].equals("0")) return "0";

        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }

    // ✅ MAIN method for VS Code / Terminal testing
    public static void main(String[] args) {
        Day32 obj = new Day32();

        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(obj.largestNumber(nums)); // Output: 9534330
    }
}
