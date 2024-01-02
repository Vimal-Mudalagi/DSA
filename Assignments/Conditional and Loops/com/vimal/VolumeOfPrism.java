package com.vimal;
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the breadth of the Prism: ");
        float breadth = in.nextFloat();

        System.out.println("Enter the height of the Prism: ");
        float height = in.nextFloat();

        System.out.println("Enter the length of the Prism: ");
        float length = in.nextFloat();

        //Volume = 1/2 * b * h * l
        float volume = (float) (0.5 * breadth * height * length);

        System.out.println("The volume of the Prism is: " + volume);
    }
}
