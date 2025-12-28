import java.util.*;

public class Day31 {

    public List<Integer> targetIndices(int[] nums, int target) {
        int countLess = 0;
        int countTarget = 0;

        for (int num : nums) {
            if (num < target) {
                countLess++;
            } else if (num == target) {
                countTarget++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < countTarget; i++) {
            result.add(countLess + i);
        }

        return result;
    }

    // ✅ MAIN METHOD for VS Code / Terminal
    public static void main(String[] args) {
        Day31 obj = new Day31();

        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        System.out.println(obj.targetIndices(nums, target));
    }
}
