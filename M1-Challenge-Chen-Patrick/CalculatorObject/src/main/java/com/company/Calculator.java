package com.company;

public class Calculator {

    public static int add(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    public static double add(double a, double b) {
        double result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    public static int subtract(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }

    public static double subtract(double a, double b) {
        double result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }

    public static double multiply(double a, double b) {
        double result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }

    public static int divide(int a, int b) {
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }

    public static double divide(double a, double b) {
        double result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }
}

