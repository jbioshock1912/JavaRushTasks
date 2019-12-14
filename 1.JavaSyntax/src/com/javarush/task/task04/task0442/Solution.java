package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0; while (true) {

            String numString = reader.readLine();
            int num = Integer.parseInt(numString);
            sum = sum + num;

            if (num == -1)
            {System.out.println(sum);
                break;}


        }
    }
}
