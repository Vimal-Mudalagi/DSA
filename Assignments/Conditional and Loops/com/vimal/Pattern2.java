package com.vimal;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = 4;
        int v = 5;

        for (int i = 1; i <=h; i++) {
            for (int j = 1; j<=v; j++) {

                if (i == 1 || j == 1 || i == h || j == v){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

