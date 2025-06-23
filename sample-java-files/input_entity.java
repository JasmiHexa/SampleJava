// Example: Taking input in Java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking a String input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);

        // Taking an integer input
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // Taking a double input
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // Taking a character input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You entered: " + ch);

        // Close the scanner
        scanner.close();
    }
}
