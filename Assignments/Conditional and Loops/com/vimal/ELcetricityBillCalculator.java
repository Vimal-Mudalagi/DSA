package com.vimal;

import java.util.Scanner;

public class ELcetricityBillCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of units consumed: ");
        int unitsConsumed = in.nextInt();

        //To calculate electricity bill

        double ratePerUnit = 0.96;
        double totalBill = calculateBill(unitsConsumed, ratePerUnit);

        System.out.println("The total electricity bill is ₹ " + totalBill );
    }

    private static double calculateBill(int unitsConsumed, double ratePerUnit) {
        double totalBill = 0;

        for (int i = 1; i <= unitsConsumed ; i++) {
            totalBill = totalBill + ratePerUnit;
        }
        return(totalBill);
    }
}
