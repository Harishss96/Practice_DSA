import java.util.Scanner;
public class PerfectNumber {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;
        //check factors of given number
        int i = 1;
        while (i < num) {
            if (num % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
            i++;
        }

        
        if(sum == num) {
        System.out.println(num + " is a perfect number");
        }
        else {
            System.out.println(num + " is not a perfect number");
        }


        input.close();
       
    }
}
