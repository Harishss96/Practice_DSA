package com.Java;
import java.util.Scanner;
public class Countingoccurensess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter the number to count occurrences: ");
        int num = input.nextInt();
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("The number " + num + " occurs " + count + " times in the array.");
        input.close();
    
    
    
    }
}