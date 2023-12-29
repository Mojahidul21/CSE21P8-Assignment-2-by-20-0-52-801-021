public class MethodOverloadingExample {

    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Method with a String parameter
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        // Using the method with two integer parameters
        System.out.println("Sum of two integers: " + example.add(5, 10));

        // Using the method with three integer parameters
        System.out.println("Sum of three integers: " + example.add(5, 10, 15));

        // Using the method with two double parameters
        System.out.println("Sum of two doubles: " + example.add(3.5, 2.5));

        // Using the method with String parameters
        System.out.println("Concatenated Strings: " + example.concatenate("Hello",
        		" World"));
    }
}