import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers between 1 and " + n + ":");

        // Find and print prime numbers up to n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Check if i is divisible by any number from 2 to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print i if it is prime
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}