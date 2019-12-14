package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int first = number/100;
        int second = number/10%10;
        int third = number%10;
        int summa;
        summa = first + second + third;
        return summa;










        //напишите тут ваш код
    }
}