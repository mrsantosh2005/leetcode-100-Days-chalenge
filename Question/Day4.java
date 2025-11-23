public class Day4 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.tribonacci(25));  // test here
    }
}

class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int ft = 0;
        int st = 1;
        int tt = 1;

        for (int i = 3; i <= n; i++) {
            int fot = ft + st + tt;
            ft = st;
            st = tt;
            tt = fot;
        }

        return tt;
    }
}
