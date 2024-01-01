package com.vimal;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of a Circle: ");
        float radius = in.nextFloat();

        float area = (float) (Math.PI * radius * radius);

        System.out.println("The area of the circle is: " + area);
    }
}
