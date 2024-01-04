package com.vimal;
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = in.nextInt();

//        A year is a leap year if it is divisible by 4.
//        However, if the year is divisible by 100, it is not a leap year, unless...
//...it is also divisible by 400. In that case, it is a leap year.

        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println("It is a leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
