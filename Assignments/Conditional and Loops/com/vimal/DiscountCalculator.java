package com.vimal;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the original price of the product: ₹");
        float originalPrice = in.nextFloat();

        System.out.println("Enter the discount price (in %): ");
        float discountPrice = in.nextFloat();

        float discountAmount = (originalPrice * discountPrice) / 100;
        float finalPrice = (originalPrice - discountAmount);

        System.out.println("The original price: ₹" + originalPrice);
        System.out.println("The discount percentage: " + discountPrice +"%");
        System.out.println("The discounted amount: ₹" + discountAmount);
        System.out.println("The final price: ₹" + finalPrice);
    }
}
