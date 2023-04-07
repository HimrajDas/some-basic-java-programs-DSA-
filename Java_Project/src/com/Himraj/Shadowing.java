package com.Himraj;

public class Shadowing {
    static int x = 100;   // This will be shadowed at line8.

    public static void main(String[] args) {
        System.out.println(x);  // 100
        int x = 50;   // the class variable at line 4 is modified by this.
        System.out.println(x);  // 50
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
