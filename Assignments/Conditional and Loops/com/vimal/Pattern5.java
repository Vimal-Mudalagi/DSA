package com.vimal;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 4;

        for (int i = 1; i<=n; i++) {
            // to print space
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // print star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
