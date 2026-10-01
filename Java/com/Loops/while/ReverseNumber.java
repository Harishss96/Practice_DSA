import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the input number");
        int num = input.nextInt();
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Product of digits: " + reverse);

        input.close();

    }
}
