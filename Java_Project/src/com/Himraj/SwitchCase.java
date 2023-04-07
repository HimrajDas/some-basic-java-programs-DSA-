package com.Himraj;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Fruit: ");
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "apple" -> System.out.println("king of fruits");
//            case "orange" -> System.out.println("round fruit");
//            case "mango" -> System.out.println("a delicious fruit");
//            default -> System.out.println("Please enter a valid fruit name!");
//        }

        System.out.print("Day: ");
        int day = in.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
