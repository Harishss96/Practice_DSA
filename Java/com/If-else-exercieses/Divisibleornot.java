
import java.util.Scanner;

public class Divisibleornot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a NUmber");
        int num = input.nextInt();
        if ((num % 5 == 0) && (num % 11 == 0)) {
            System.out.println("Number is divisible by 5 and 11");
        }
        else if (num % 5 == 0) {
        System.out.println("Number is divisible by 5 but not by 11");
        } else if (num % 11 == 0) {
        System.out.println("Number is divisible by 11 and but not by 5");
        }
        else {
            System.out.println("Not divisible, enter a valid number");
        }

    }

}
