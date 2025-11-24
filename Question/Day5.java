import java.util.*;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numBottles: ");
        int numBottles = sc.nextInt();

        System.out.print("Enter numExchange: ");
        int numExchange = sc.nextInt();

        System.out.println("Maximum bottles you can drink: " + numWaterBottles(numBottles, numExchange));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        int empty = 0;

        while (numBottles > 0) {
            ans += numBottles;      
            empty += numBottles;    
            numBottles = empty / numExchange;  
            empty %= numExchange;   
        }

        return ans;
    }
}
