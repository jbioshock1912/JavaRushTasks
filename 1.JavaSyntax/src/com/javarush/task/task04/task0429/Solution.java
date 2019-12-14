package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aString = reader.readLine();
        int a = Integer.parseInt(aString);
        String bString = reader.readLine();
        int b = Integer.parseInt(bString);
        String cString = reader.readLine();
        int c = Integer.parseInt(cString);
        int plus = 0;
        int minus = 0;
        if ((a>0 || b>0 || c>0))
        if (a>0)
            plus ++;
        if (b>0)
            plus ++;
        if (c>0)
            plus ++;

    if ((a<0 || b<0 || c<0))
        if (a<0)
            minus ++;
        if (b<0)
            minus ++;
        if (c<0)
        minus ++;

        System.out.println("количество отрицательных чисел: " + minus);
        System.out.println("количество положительных чисел: " + plus);
}
}