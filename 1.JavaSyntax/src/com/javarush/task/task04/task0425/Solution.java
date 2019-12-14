package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneString = reader.readLine();
        int one = Integer.parseInt(oneString);
        String twoString = reader.readLine();
        int two = Integer.parseInt(twoString);
        if (one > 0 && two > 0) {
            System.out.println("1");

        } else if (one < 0 && two > 0) {
            System.out.println("2");
        } else if (one < 0 && two < 0) {
            System.out.println("3");
        } else if (one > 0 && two < 0) {
            System.out.println("4");
        }
    }
}
