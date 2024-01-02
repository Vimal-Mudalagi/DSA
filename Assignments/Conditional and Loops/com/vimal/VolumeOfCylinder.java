package com.vimal;
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height of the Cylinder: ");
        float height = in.nextFloat();

        System.out.println("Enter the radius of the Cylinder: ");
        float radius = in.nextFloat();

        // V = pi *r square * h
        float volume = (float) (Math.PI * Math.pow(radius,2) * height);

        System.out.println("The volume of the Cylinder is: " + volume);
    }
}
