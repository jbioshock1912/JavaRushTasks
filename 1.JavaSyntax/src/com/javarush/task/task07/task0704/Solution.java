package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            String s = reader.readLine();
            number[i] = Integer.parseInt(s);
        }
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);
        }
    }
}

