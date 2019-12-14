package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        int n = 1;
        while (n < 11) {
            while (i < 11) {
                System.out.print(i * n + " ");
                i++;
            }
            System.out.println();
            n++;
            i=1;
        }
    }
}
