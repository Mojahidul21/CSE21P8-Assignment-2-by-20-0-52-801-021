import java.util.Scanner;

public class SolutionQuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read coefficients a, b, and c from the user
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if the discriminant is non-negative for real solutions
        if (discriminant >= 0) {
            // Calculate the real solutions using the quadratic formula
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Real solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            System.out.println("No real solutions. Discriminant is negative.");
        }

        scanner.close();
    }
}