
import java.util.Scanner;

public class Checkaplhabetdigitspecial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter anything in the input");
        char ch = input.next().charAt(0);

        if (((ch >= 'a' && ch <= 'z')) || ((ch >= 'A' && ch <= 'Z'))) {
            System.out.println(" This is an alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("This is an digit");
        }

        else {
            System.out.println("This is speacial charater");
        }
    }
}
