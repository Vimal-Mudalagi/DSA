package com.vimal;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int userInput;

        System.out.println("Enter integers (enter 0 to stop):");

        do {
            System.out.print("Enter a number: ");
            userInput = in.nextInt();
            sum = sum + userInput;
        } while (userInput != 0);

        System.out.println("Sum of entered numbers: " + sum);

        return;
    }
}

