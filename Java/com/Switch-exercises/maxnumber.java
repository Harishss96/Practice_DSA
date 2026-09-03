import java.util.Scanner;

public class maxnumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for num1 and num2");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = (num1 > num2) ? 1 : 2;

        switch (result) {

            case 1:
                System.out.println("Num1 is Largest");
                break;

            case 2:
                System.out.println("Num2 is Largest");
                break;
        }

        input.close();
    }
}