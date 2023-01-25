package com.bridgelabz.generics;

public class Generics {
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x;
        //System.out.println(y.compareTo(max));
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        //printMax(x, y, z, max);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics practice problem");
        Integer x = 100, y = 300, z = 200;
        System.out.println("For Integer Values");
        int result =max(x, y, z);
        System.out.println("The Maximum Value is " +result);
    }
}
