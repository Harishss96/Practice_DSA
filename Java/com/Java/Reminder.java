package com.Java;

import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter the Number : ");
        // int num = input.nextInt();
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int answer = 0;
        for (int i = 0; i < size; i++) {
            int rem = arr[i] % 10; // Get the last digit
            arr[i] /= 10; // Remove the last digit
            answer = answer * 10 + rem; // Build the answer in reverse order
        }
    //     int answer = 0;
    //     while (arr < 0) {
    //         int rem = num % 10;
    //         num /= 10;
    //         answer = answer * 10 + rem;

    // }
            System.out.println("The answer is: " + answer);
        input.close();
}
}