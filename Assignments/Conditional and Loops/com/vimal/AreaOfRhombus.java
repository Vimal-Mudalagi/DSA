package com.vimal;
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the first Diagonal 1: ");
        double Diagonal1 = in.nextDouble();

        System.out.println("Enter the length of the second Diagonal 2: ");
        double Diagonal2 = in.nextDouble();

        double area = (double) (0.5 * Diagonal1 * Diagonal2);

        System.out.println("The area of the Rhombus is: " + area);
    }
}
