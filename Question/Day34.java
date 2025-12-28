import java.util.*;

public class Day34 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // carry
        }

        // All digits were 9
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    // ✅ MAIN method for VS Code / Terminal testing
    public static void main(String[] args) {
        Day34 obj = new Day34();

        int[] digits = {9, 9, 9};
        int[] result = obj.plusOne(digits);

        System.out.println(Arrays.toString(result)); // Output: [1, 0, 0, 0]
    }
}
