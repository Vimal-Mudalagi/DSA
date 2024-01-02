package com.vimal;
import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of Equilateral Triangle: ");
        float side = in.nextFloat();

        //Perimeter = 3 * a
        float perimeter = (float) (3 * side);

        System.out.println("The perimeter of the Equilateral Triangle is: " + perimeter);

    }
}
