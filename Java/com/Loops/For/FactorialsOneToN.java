import java.util.Scanner;

public class FactorialsOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println(i + "! = " + factorial);
        }

        sc.close();
    }
}