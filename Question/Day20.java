import java.util.*;

public class Day20 {

    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : arr) freq.put(n, freq.getOrDefault(n, 0) + 1);

        int ans = -1;
        for (int n : freq.keySet())
            if (n == freq.get(n)) ans = Math.max(ans, n);

        return ans;
    }

    public static void main(String[] args) {
        Day20 s = new Day20();
        int[] arr = {2, 2, 3, 4};
        System.out.println(s.findLucky(arr));
    }
}
