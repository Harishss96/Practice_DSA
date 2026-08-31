
import java.util.Scanner;

public class CheckUpLow {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter anything in the input");
        char ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(" This is an Lowercase Alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This is an Uppercase Alphabet");
        }

        else {
            System.out.println("This is not valid charater");
        }
    }
}
