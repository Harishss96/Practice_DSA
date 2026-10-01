import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int i = 1;
        int hcf = 1;

        while (i <= num1 && i <= num2) {

            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }

            i++;
        }

        System.out.println("HCF = " + hcf);

        input.close();
    }
}