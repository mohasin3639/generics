package com.bridgelabz.generics;
public class Generics {
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Generics practice problem");
        String d = "apple", e = "Peach", f = "Banana";
        System.out.println("For String Values");
        String result =max(d, e, f);
        System.out.println("The Maximum Value is " +result);
    }
}
