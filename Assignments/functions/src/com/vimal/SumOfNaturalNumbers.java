package com.vimal;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        long num = scanner.nextLong();

        long result = sumOfFirstNNumbers(num);
        System.out.println("The sum of 1st n natural numbers is: " + result);
    }

    private static long sumOfFirstNNumbers(long n) {
        return   n * (n + 1) / 2;
    }
}