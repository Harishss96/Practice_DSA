import java.util.Scanner;

public class SmallestDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int smallest = 9;
        while (num > 0) {
            int digit = num % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            num = num / 10;
        }

        System.out.println("Smallest digit: " + smallest);
        input.close();
    }
}