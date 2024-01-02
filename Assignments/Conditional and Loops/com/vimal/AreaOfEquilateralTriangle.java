package com.vimal;
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side length of Equilateral Triangle: ");
        double sideLength = in.nextDouble();

        // Area = (sqrt of 3 / 4) * a square
        double area = (double) (Math.sqrt(3) / 4 * Math.pow(sideLength, 2));

        System.out.println("The area of the Equilateral Triangle is: " + area);
    }
}
