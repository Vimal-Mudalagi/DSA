package com.vimal;
import java.util.Scanner;

public class Pattern3HalfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 4;

        for (int i = 1; i <=a; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
