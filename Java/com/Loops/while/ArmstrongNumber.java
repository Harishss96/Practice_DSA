import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int original = num;
        int digits = 0;

        // Count the number of digits from the given input
        while (num > 0) {
            digits++;
            num = num / 10;
        }

        num = original;
        int sum = 0;

        // Calculate Armstrong sum of digits
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, digits);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        input.close();
    }
}