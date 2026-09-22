import java.util.Scanner;

public class RecursiveGCD {

    public static int gcd(int a, int b) {
        System.out.println("gcd(" + a + ", " + b + ")");

        if (b == 0) {
            return a;
        }

        System.out.println("a % b = " + (a % b));

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("The two numbers cannot both be zero.");
        } else if (a < 0 || b < 0) {
            System.out.println("Please enter non-negative integers.");
        } else {
            int result = gcd(a, b);

            System.out.println("GCD = " + result);
        }

        input.close();
    }
}
