package com.vimal;
import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number ");
        int num2 = in.nextInt();

        returnSum(num1, num2);
    }
    private static void returnSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of the two numbers is: " + sum);
    }
}
