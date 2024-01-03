package com.vimal;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of values (N): ");
        int N = in.nextInt();

        double sum = 0;

        System.out.println("Enter " + N + " numbers:");

        for (int i = 0; i < N ; i++) {
            System.out.println("Enter the " + ( i + 1 )  + " number: ");
            double num = in.nextDouble();
            sum = sum + num;
        }
        double average = sum / N;
        System.out.println("The average of the entered numbers is: " + average);
    }
}
