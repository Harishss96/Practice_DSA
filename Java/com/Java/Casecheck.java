package com.Java;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().trim().charAt(0); 
        if (Character.isUpperCase(ch)) {
            System.out.println("The character is uppercase.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("The character is lowercase.");
        } else {
            System.out.println("The character is neither uppercase nor lowercase.");
        }
        input.close();
    }




    
}
