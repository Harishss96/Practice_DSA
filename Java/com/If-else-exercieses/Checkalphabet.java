import java.util.Scanner;

public class Checkalphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a alphabet");
        char ch = input.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("This is an alphabet");
        }
        else {
            System.out.println("This is not alphabet");
        }

    }
}
