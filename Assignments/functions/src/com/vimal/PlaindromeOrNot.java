package com.vimal;
import java.util.Scanner;

public class PlaindromeOrNot {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("It is not a palindrome.");
            }
        }

        public static boolean isPalindrome(int num) {
            int enteredNumber = num;
            int reversedNumber = 0;

            while (num > 0) {
                int digit = num % 10;
                reversedNumber = reversedNumber * 10 + digit;
                num /= 10;
            }

            return enteredNumber == reversedNumber;
        }
    }

