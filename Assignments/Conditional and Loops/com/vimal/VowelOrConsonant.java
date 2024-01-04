package com.vimal;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String enteredString = in.nextLine();

        for (int i = 0; i < enteredString.length(); i++) {
            char currentChar = enteredString.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                    currentChar == 'o' || currentChar == 'u' ||
                    currentChar == 'A' || currentChar == 'E' || currentChar == 'I' ||
                    currentChar == 'O' || currentChar == 'U') {
                System.out.println(currentChar + " is a vowel.");
            } else {
                System.out.println(currentChar + " is a consonant.");
            }
        }
    }
}
