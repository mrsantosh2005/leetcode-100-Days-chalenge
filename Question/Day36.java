import java.util.*;

public class Day36 {

    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }

    // ✅ MAIN method for VS Code / Terminal testing
    public static void main(String[] args) {
        Day36 obj = new Day36();

        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(obj.average(salary)); // Output: 2500.0
    }
}
