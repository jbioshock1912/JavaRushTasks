package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(convertEurToUsd(5, 7.5));
        System.out.println(convertEurToUsd(7, 8.5));
    }

    public static double convertEurToUsd(int eur, double course) {
        double c;
        c = eur * course;
        return c;
    }
}
