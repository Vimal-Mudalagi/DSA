package com.vimal;
import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to find the factorial: ");
        int num = in.nextInt();

        factorial(num);

    }

    private static void factorial(int a) {
        if(a < 0){
            System.out.println("Undefined");
        }

        int factorial=1;

        for (int i = 2; i <=a ; i++) {
            factorial *= i;
        }
        System.out.println("Factoraial of the number is: " + factorial);
    }
}
