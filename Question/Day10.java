public class Day10 {

    public static void main(String[] args) {
        int[] nums = {3, 0, 1}; 
        Solution obj = new Solution();
        int result = obj.missingNumber(nums);
        System.out.println("Missing Number: " + result);
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length; // Start with n
        
        for (int i = 0; i < nums.length; i++) {
            xor ^= i;        // XOR with index
            xor ^= nums[i];  // XOR with array value
        }
        
        return xor; // Remaining value is the missing number
    }
}
