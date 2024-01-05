package com.vimal;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        float radius = in.nextFloat();

        CircumAndArea(radius);
    }

    private static void CircumAndArea(float r) {
        float circum = (float) (2 * Math.PI * r);
        System.out.println(("Circumference is: " + circum));

        float area = (float) (Math.PI * Math.pow(r, 2));
        System.out.println("Area is: " + area);
    }
}