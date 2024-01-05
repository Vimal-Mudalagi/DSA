package com.vimal;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hey You!! Enter your Age: ");
        int age = in.nextInt();

        Eligible(age);
    }

    private static void Eligible(int a) {
        if (a >= 18){
            System.out.println("Congrats!! You are eligible to vote: ");
        } else{
            System.out.println("Get out!! You are not eligible to vote!: ");
        }
    }
}
