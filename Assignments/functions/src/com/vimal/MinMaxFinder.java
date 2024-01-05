package com.vimal;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = in.nextInt();

        System.out.println("Enter the second number: ");
        int secNum = in.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNum = in.nextInt();

        maximumNumber(firstNum, secNum, thirdNum);
        minimumNumber(firstNum, secNum, thirdNum);
    }

    private static void maximumNumber(int a, int b, int c) {
        int max = Math.max(Math.max(a, b),c);
        System.out.println("The maximum number is: " + max);
    }

    private static void minimumNumber(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        System.out.println("The minimum number is: " + min);
    }

}
