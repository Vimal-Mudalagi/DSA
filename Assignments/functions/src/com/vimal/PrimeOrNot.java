package com.vimal;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();

        int result = isPrime(num);

        if (result == 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        isPrime(num);
    }

    private static int isPrime(int a) {
        if (a <= 1) {
            return 0;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return 0; // If divisible, 0 indicates that the number is not prime
            }
        }

       return 1;
    }
}
