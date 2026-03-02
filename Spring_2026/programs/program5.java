package programs;

public class program5 {
    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            for (int g = 1; g < 13; g++) {
                int result = multiplyTwoNumbers(i, g);
                System.out.println(i + " x " + g + " = " + result);
            }
        }
        }
        public static int multiplyTwoNumbers(int a, int b) {
            int calculate = a * b;
            return calculate;
        }
}
