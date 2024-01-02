package com.vimal;
import java.util.Scanner;

public class PrintLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largestNumber = Integer.MIN_VALUE;
        int userInput;

        do{
            System.out.print("Enter a number: ");
            userInput = in.nextInt();

            if (userInput > largestNumber) {
                largestNumber = userInput;
            }

        } while (userInput != 0);

        System.out.println("Largest number entered: " + largestNumber);
    }
}
