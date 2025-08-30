package Num_codes;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int factorial = 1;

        while(num>0){
            factorial=factorial*num;
            num=num-1;

        }

        // Output result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
