package com.vimal;
import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer n: ");
        int n = in.nextInt();

        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }

        int result = product - sum;

        System.out.println("The difference between the product and sum of digits is: " + result);
    }
}

