package com.vimal;
import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // CSA = 2 pi r h
        System.out.println("Enter the radis of the Cylinder: ");
        float radius = in.nextFloat();

        System.out.println("Enter the height of the Cylinder: ");
        float height = in.nextFloat();

        float CSA = (float) (2 * Math.PI * radius * height);

        System.out.println("The CSA of Cylinder is: " + CSA);
    }
}
