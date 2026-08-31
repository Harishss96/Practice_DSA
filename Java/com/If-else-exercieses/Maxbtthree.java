
import java.util.Scanner;

public class Maxbtthree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if (b > max &&  b > c){
            System.out.println("B is the largest number");
        }
        if (c > max) {
            System.out.println("C is the Largest number");
        }
                else{
            System.out.println("A is the largest number");
        }
        // else {
        //     System.out.println("A is the largest number");
        // }
        input.close();
    }
}