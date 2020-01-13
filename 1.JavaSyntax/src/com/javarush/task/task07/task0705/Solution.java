package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigList = new int[20];

        for (int i = 0; i < bigList.length; i++) {
            bigList[i] = Integer.parseInt(reader.readLine());
        }
        int[] oneList = new int[10];
        for (int index = 0; index < oneList.length; index++) {
            oneList[index] = bigList[index];
        }

        int[] twoList = new int[10];
        for (int index = 0; index < twoList.length; index++) {
            twoList[index] = bigList[index + 10];
            System.out.println(twoList[index]);
        }
    }
}