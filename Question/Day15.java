public class Day15 {

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        Day15 obj = new Day15();

        int n = 10;  // you can change this value to test
        int result = obj.bulbSwitch(n);

        System.out.println("Bulbs ON: " + result);
    }
}
