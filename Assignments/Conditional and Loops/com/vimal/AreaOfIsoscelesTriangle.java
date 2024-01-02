package com.vimal;
import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height 'h' of the Triangle: ");
        float height = in.nextFloat();

        System.out.println("Enter the breadth 'b' of the Triangle: ");
        float breadth = in.nextFloat();

        float area = (float) (0.5 * height * breadth);

        System.out.println("The area of the Triangle is: " + area);
    }
}
