package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneString = reader.readLine();
        int one = Integer.parseInt(oneString);
        String twoString = reader.readLine();
        int two = Integer.parseInt(twoString);
        int sum = one + two;
        System.out.println("Sum = " + sum);
    }
}
