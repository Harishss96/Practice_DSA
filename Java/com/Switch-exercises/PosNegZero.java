import java.util.Scanner;

public class PosNegZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value to check Positive or Negative or Zero");

        int num = input.nextInt();

        int result = (num > 0) ? 1 : (num < 0) ? 2 : 3;

        switch (result) {

            case 1:
                System.out.println("Number is Positive");
                break;

            case 2:
                System.out.println("Number is Negative");
                break;
            case 3:
                System.out.println("Number is Zero");
                break;
        }

        input.close();
    }
}