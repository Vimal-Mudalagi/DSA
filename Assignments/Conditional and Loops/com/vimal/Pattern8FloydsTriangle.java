package com.vimal;
import java.util.Scanner;

public class Pattern8FloydsTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=5;
        int number = 1;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}