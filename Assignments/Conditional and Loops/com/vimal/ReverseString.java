package com.vimal;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String originalString = in.nextLine();

        String reversedString = "";

        for (int i = originalString.length() - 1; i >=0 ; i--) {
            reversedString += originalString.charAt(i);

            System.out.println("Original String: " + originalString);
            System.out.println("Reversed String: " + reversedString);
        }
    }
}
