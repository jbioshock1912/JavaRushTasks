package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
       int total = a + b;
        return total;
    }

    public static int minus(int a, int b) {
       int total = a - b;
        return total;
    }

    public static int multiply(int a, int b) {
       int total = a * b;
        return total;
    }

    public static double division(int a, int b) {
       double total = (double) a/b;
        return total;
    }

    public static double percent(int a, int b) {
        double total = a * b/100.0;
        return total;
    }

    public static void main(String[] args) {

    }
}