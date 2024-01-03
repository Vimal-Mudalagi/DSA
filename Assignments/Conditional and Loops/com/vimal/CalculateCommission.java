package com.vimal;
import java.util.Scanner;

public class CalculateCommission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Commission Amount: ₹");
        float commissionAmount = in.nextFloat();

        System.out.println("Enter the Sales Amount: ₹");
        float salesAmount = in.nextFloat();

        float commissionPercentage = 0;
        commissionPercentage = (commissionAmount/salesAmount) * 100;

        System.out.println("Your Commission Percentage is: " + commissionPercentage +"%");
    }
}
