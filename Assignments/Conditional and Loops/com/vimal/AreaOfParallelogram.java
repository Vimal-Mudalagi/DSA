package com.vimal;
import java.util.Scanner;
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height 'h' of the Parallelogram: ");
        float height = in.nextFloat();

        System.out.println("Enter the breadth 'b' of the Parallelogram: ");
        float base = in.nextFloat();

        float area = (float) (height * base);

        System.out.println("The area of the Parallelogram is: " + area);
    }
}
