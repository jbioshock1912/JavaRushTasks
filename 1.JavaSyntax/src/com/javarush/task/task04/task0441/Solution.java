package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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
        if ((a < c && a > b) || (a > b && a < c)) {
            System.out.println(a);
        } else if ((b < c && b > a) || (b > c && b < a)) {
            System.out.println(b);
        } else if ((c < b && c > a) || (c < a && c > b)) {
            System.out.println(c);
        } else if ((a == b) && !(a == c)) {
            System.out.println(a);
        } else if ((b == c) && !(b == a)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
