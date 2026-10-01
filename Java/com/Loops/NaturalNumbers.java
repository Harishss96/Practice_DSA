package com.Loops;

import java.util.Scanner;
public class NaturalNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value to print Natural number");
        int num = input.nextInt();

        System.out.println("Natural numbers from 1 to:" + num);
        for (int i = num; i == 1; --i) {
            System.out.println(i);
        }

        input.close();
    }
}