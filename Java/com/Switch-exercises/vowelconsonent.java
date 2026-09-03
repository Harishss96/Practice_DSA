import java.util.Scanner;

public class vowelconsonent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Character");

        switch (input.next().toLowerCase()) {

            case "a":
            case "e":
            case "i":
            case "o":
            case "u":

                System.out.println("This is Vowel");
                break;

            default:
                System.out.println("This is Consonent");
                return;

        }

    }

}
