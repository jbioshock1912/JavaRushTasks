package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double i = -1;
        while (true) {
            String numString = reader.readLine();
            double num = Integer.parseInt(numString);
            sum = sum + num;
            i++;
            if (num == -1) {
                System.out.println((sum + 1) / i);
                break;
            }
        }
    }
}


