package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chisloOneString = reader.readLine();
        int chisloOne = Integer.parseInt(chisloOneString);
        String chisloTwoString = reader.readLine();
        int chisloTwo = Integer.parseInt(chisloTwoString);
        if (chisloOne < chisloTwo) {
            System.out.println(chisloOne);

        } else if  (chisloOne > chisloTwo) {
            System.out.println(chisloTwo);
        } else

        System.out.println(chisloOne);

    }}

