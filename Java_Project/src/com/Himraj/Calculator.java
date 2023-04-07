package com.Himraj;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operation: ");
            char operation = input.next().trim().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%') {
                System.out.print("Enter two number: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (operation == '+') {
                    ans = num1 + num2;
                } else if (operation == '-') {
                    ans = num1 - num2;
                } else if (operation == '*') {
                    ans = num1 * num2;
                } else if (operation == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else {
                    ans = num1 % num2;
                }

                System.out.println(ans);
            } else if (operation == 'x' || operation == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!");
            }
        }
    }
}
