import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int lcm;

        if (num1 > num2) {
            lcm = num1;
        } else {
            lcm = num2;
        }

        while (true) {

            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }

            lcm++;
        }

        System.out.println("LCM = " + lcm);

        input.close();
    }
}