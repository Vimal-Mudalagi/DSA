package com.vimal;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 number to check if it is a Pythagorean Triplet or Not");
        System.out.println("Enter the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the 3rd number: ");
        int num3 = scanner.nextInt();

        if (true){
            System.out.println("Yes it is a Pythagorean Triplet");
        } else {
            System.out.println("No it is not a Pythagorean Triplet");
        }

        boolean pythagoreanTriplet = isPythagoreanTriplet(num1, num2, num3);
    }

    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        int squareA = a * a;
        int squareB = b * b;
        int squareC = c * c;

        return(squareA + squareB == squareC || squareB + squareC == squareA || squareA + squareC == squareB);
    }
}

