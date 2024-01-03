package com.vimal;
import java.util.Scanner;

public class distanceCalculatorBtwTwoPoints {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the x-coordinate (x1) of the first point: ");
        float x1 = in.nextFloat();

        System.out.print("Enter the y-coordinate (y1) of the first point: ");
        float y1 = in.nextFloat();

        System.out.print("Enter the x-coordinate (x2) of the second point: ");
        float x2 = in.nextFloat();

        System.out.print("Enter the y-coordinate (y2) of the second point: ");
        float y2 = in.nextFloat();

        double distance;
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the two points is: " + distance);

    }
}
