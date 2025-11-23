public class Day2 {

    public static boolean isPowerOfTwo(int x) {
        if (x == 0) {
            return false;
        }

        while (x % 2 == 0) {
            x = x / 2;
        }

        if (x == 1) {
            return true;
        } else {
            return false;
        }
    }

    // For testing in VS Code
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));   // true
        System.out.println(isPowerOfTwo(16));  // true
        System.out.println(isPowerOfTwo(18));  // false
        System.out.println(isPowerOfTwo(64));  // true
    }
}
