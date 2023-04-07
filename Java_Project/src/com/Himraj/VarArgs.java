package com.Himraj;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(5, 6, 7, 8, 9);
        multiple(5, 10, "Himraj", "Harry", "david");
    }

    static void fun(int ...var) {
        System.out.println(Arrays.toString(var));
    }

    static void multiple(int a, int b, String ...names) {

    }
}
