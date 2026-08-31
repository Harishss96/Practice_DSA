
import java.util.Scanner;

public class Maxbttwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int largest = a;
        if (b > largest) {
            largest = b;
            System.out.println("The largest number is: " + largest);
        } else if (b == largest) {
            System.out.println("These number are equal, please enter valid number to complete the excution");
        } else {
            System.out.println("Enter a valid number");
        }
        input.close();

    }
}
