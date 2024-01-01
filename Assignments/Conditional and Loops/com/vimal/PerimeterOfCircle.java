package com.vimal;

import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of a Circle: ");
        float radius = in.nextFloat();

        float perimeter = (float) (2 * Math.PI * radius);

        System.out.println("The perimeter of the Circle is: " + perimeter);
        return;
    }
}
