package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        if (a >= c && a >= b && b >= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a >= c && a >= b && c >= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b >= a && b >= c && a >= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b >= a && b >= c && c >= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c >= a && c >= b && a >= b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c >= a && c >= b && b >= a) {
            System.out.println(c + " " + b + " " + a);
        }
    }
}
