package com.vimal;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle: ");
        float length = in.nextFloat();

        System.out.println("Enter the width of the Rectangle: ");
        float width = in.nextFloat();

        float area = (float) (length * width);

        System.out.println("The area of the Rectangle is: " + area);
    }
}
