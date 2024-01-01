package com.vimal;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int p = 0; /* Previous index */
        int c = 1; /* Current index */
        int count = 2;

        while (count <=n){
            int temp = c;
            c = c + p;
            p = temp;
            count++;
        }
        System.out.println(c);
    }
}
