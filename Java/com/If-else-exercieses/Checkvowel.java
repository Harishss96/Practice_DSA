
import java.util.Scanner;

public class Checkvowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any aplhabet");
        char ch = input.next().charAt(0);

        if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ) {
            System.out.println("Aplhabet is an vowel");
        } else {
            System.out.println("This is not an vowel, enter a valid char");
        }
    }
}
