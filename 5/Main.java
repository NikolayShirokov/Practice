package com.company;

public class Main {
    static int x = 0;

    public static void num(int n) {
        if (n > 0) {
            x++;
            System.out.println(x);
            num(n - 1);
        }
    }

    public static void main(String[] args) {
        num(10);
    }
}
