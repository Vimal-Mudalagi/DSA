package com.vimal;
import java.util.Scanner;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number ");
        int num2 = in.nextInt();

        returnProduct(num1, num2);
    }

    private static void returnProduct(int a, int b) {
       int product = a * b;
        System.out.println("Product of two numbers is: " + product);
    }
}

