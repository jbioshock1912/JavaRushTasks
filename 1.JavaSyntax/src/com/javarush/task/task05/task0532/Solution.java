package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int number = Integer.parseInt(reader.readLine());
                maximum = number > maximum || i == 0 ? number : maximum;
            }

            System.out.println(maximum);
        }
    }
}