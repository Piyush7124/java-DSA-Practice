package Num_codes;
import java.util.Scanner;

public class PrimeNumbersList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input upper limit
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");

        // Loop from 2 to n
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
