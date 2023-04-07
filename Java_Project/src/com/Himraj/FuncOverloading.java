package com.Himraj;

public class FuncOverloading {
    public static void main(String[] args) {
        fun(50);
        fun("Himraj");

    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
