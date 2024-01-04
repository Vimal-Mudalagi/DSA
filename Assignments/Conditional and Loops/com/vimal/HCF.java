package com.vimal;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = in.nextInt();

        System.out.println("Enter the second number: ");
        int secondNum = in.nextInt();


        int hcf = 1;

        int smallerNumber;
        if (firstNum < secondNum) {
            smallerNumber = firstNum;
        } else {
            smallerNumber = secondNum;
        }
        for (int i = 1; i <= smallerNumber; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of the two numbers is: " + hcf);
    }
    }
