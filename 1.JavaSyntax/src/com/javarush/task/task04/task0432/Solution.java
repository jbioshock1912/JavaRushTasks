package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String litter = reader.readLine();
        String numberString = reader.readLine();
        int number = Integer.parseInt(numberString);
        int i = 1;
        while (i <= number) {
            System.out.println(litter);
            i++;

        }
    }
}
