import java.util.*;

public class Day6 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    // For testing in VS Code
    public static void main(String[] args) {
        Day6 obj = new Day6();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = obj.twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
