package com.javarush.task.task04.task0419;

/*
Максимум четырех чисел
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
        String dString = reader.readLine();
        int d = Integer.parseInt(dString);
        if (a >= c && a >= b && a >= d) {
            System.out.println(a);
        } else if (b >= c && b >= a && b >= d) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
