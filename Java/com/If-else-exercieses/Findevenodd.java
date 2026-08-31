
import java.util.Scanner;

public class Findevenodd {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Even Number");
        }
        else if (num % 2 != 0){
            System.out.println("Odd Number");
        }
        else {
            System.out.println("Enter a valid number");
        }
    }
}
