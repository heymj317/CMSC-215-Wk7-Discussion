import java.util.Scanner;
import java.math.BigInteger;

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
        System.out.println("Enter the size of the factorial: ");
        int size = sc.nextInt();


        System.out.println("The value of " + size + "! is: " + myFactorial(size));
    }

}