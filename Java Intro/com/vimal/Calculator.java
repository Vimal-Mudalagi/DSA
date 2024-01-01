package com.vimal;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operation: + - * % / : ");
           char operation = scanner.next().trim().charAt(0);
           int answer = 0;

            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {



                if (operation == '+') {
                    answer = num1 + num2;
                }
                if (operation == '-') {
                    answer = num1 - num2;
                }
                if (operation == '*') {
                    answer = num1 * num2;
                }
                if (operation == '/') {
                    if (num2 != 0) {
                        answer = num1 / num2;
                    }
                }
                if (operation == '%') {
                    answer = num1 % num2;
                }

            } else {
                System.out.println("Invalid operation!!");
            }

            System.out.println(answer);
        }
   }
