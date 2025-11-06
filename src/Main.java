public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = addNumbers(num1, num2, num3);
        System.out.println("The sum is: " + sum);
    }

    static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }
}
