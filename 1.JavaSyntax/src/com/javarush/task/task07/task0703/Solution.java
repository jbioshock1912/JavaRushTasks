package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++)
        {
            list[i] = reader.readLine();
        }

        int [] number = new int[10];
        for (int i =0; i < number.length; i++){
            number[i] = list[i].length();
            System.out.println(number[i]);
        }
    }
}
