package com.vimal;
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the Cone: ");
        float radius = in.nextFloat();

        System.out.println("ENter the height of the Cone: ");
        float height = in.nextFloat();

        //Volume = pi * r(square) * h/3
        float volume = (float) (Math.PI * Math.pow(radius,2) * height / 3);

        System.out.println("The volume of Cone is: " + volume);
    }
}
