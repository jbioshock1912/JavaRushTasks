package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            for (int n = 0; n <= i; n++) {
                System.out.print(8);
            }
        }
    }
}
