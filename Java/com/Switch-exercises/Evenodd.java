import java.util.Scanner;

public class Evenodd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value to check Even or Odd");

        int num = input.nextInt();

        int result = (num % 2 == 0) ? 1 : 2;

        switch (result) {

            case 1:
                System.out.println("Number is Even");
                break;

            case 2:
                System.out.println("Number is Odd");
                break;
        }

        input.close();
    }
}