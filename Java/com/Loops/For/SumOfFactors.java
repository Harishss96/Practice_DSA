
import java.util.Scanner;

public class SumOfFactors {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value to get the expected output");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
            
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
