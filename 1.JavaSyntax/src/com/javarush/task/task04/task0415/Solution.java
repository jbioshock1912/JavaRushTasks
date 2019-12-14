package com.javarush.task.task04.task0415;

/* 
Правило треугольника
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
        if ((a + b) > c && ( a + c )> b && (b + c )> a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");


        }
    }
}