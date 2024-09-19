import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a five-digit integer:");
        int number = scanner.nextInt();

        if (number < 10000 || number > 99999) {
            System.out.println("Error: The number is not five digits long.");
        } else {
            String numStr = Integer.toString(number);
            if (numStr.equals(new StringBuilder(numStr).reverse().toString())) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }

        scanner.close();
    }
}
