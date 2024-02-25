import java.math.BigInteger;
import java.util.Scanner;

public class Exercise18_01 {
    public static BigInteger myFactorial(int n) {
        if (n == 0) {
            return BigInteger.valueOf(0);
        }
        if (n == 1) {
            return new BigInteger(String.valueOf(1));
        }
        return (new BigInteger(String.valueOf(n)).multiply(myFactorial(n - 1)));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer of any size: ");
        int size = sc.nextInt();


        System.out.println("Factorial of " + size + " is " + myFactorial(size));
    }

}