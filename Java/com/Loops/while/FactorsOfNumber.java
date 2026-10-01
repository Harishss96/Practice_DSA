import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        input.close();
    }
}