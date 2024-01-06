package com.vimal;
import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marks out of 100: ");
        int marks = in.nextInt();
        
        grades(marks);
    }

    private static void grades(int num) {
        if (num >= 91 && num <= 100) {
            System.out.println("AA");
        } else if (num >= 81 && num <= 90) {
            System.out.println("AB");
        } else if (num >= 71 && num <= 80) {
            System.out.println("BB");
        } else if (num >= 61 && num <= 70) {
            System.out.println("BC");
        } else if (num >= 51 && num <= 60) {
            System.out.println("CD");
        } else if (num >= 41 && num <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }

}