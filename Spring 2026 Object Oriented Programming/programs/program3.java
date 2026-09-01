package programs;


public class program3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int result = addTwoNumbers(x,y);
        System.out.println("The result is " + result);
        }
        public static int addTwoNumbers(int a, int b) {
            int calculate = a + b;
            return calculate;
        }
}