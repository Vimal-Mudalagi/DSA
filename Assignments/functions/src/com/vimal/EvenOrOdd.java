package com.vimal;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is Even or Odd: ");
        int num = in.nextInt();

        EvenOdd(num);
    }

    private static void EvenOdd(int a) {
        if (a % 2 == 0){
            System.out.println("Hurray!! The number is Even");
        } else {
            System.out.println("Ooops!! The number came out to be Odd!");
        }
    }
}
