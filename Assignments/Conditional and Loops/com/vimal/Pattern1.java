package com.vimal;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = 5;
        int v = 4;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

