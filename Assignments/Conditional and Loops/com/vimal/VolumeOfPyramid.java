package com.vimal;
import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* V = (base area * height) /3 */

        System.out.println("Enter the base of the Pyramis: ");
        double base = in.nextDouble();

        System.out.println("Enter the height of the Cylinder: ");
        float height = in.nextFloat();

        double volume = (double) ((base * base * height) / 3);

        System.out.println("The volume of the pyramid is: " + volume );
    }
}
