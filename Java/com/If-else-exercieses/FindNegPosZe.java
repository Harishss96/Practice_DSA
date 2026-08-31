
import java.util.Scanner;

public class FindNegPosZe {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();

        if( a > 0 ){
            System.out.println("Positive Number");
        }
        else if (a < 0) {
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Number is Zero");
        }
        // else {
        //     System.out.println("Enter a valid number");
        // }
    }
}
