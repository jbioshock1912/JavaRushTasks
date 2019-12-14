package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String yearString = reader.readLine();
        int year = Integer.parseInt(yearString);

        if (year % 400 == 0 || (year % 100 > 0 && year % 4 == 0))  {
            System.out.println("количество дней в году: 366");
        } else {
            if (year % 100 == 0 && year % 400 > 0)
                System.out.println("количество дней в году: 365");


            else {
                System.out.println("количество дней в году: 365");
            }
        }
    }
}



