package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        String threeString = reader.readLine();
        int three = Integer.parseInt(threeString);
        if (one > 0 && two > 0 && three > 0) {
            System.out.println("3");
        } else if ((one > 0 && two > 0 && !(three > 0)) || (one > 0 && three > 0 && !(two > 0)) || (two > 0 && three > 0 && !(one > 0))) {
            System.out.println("2");
        } else if ((one > 0 && !(two > 0) && !(three > 0)) || (two > 0 && !(one > 0) && !(three > 0)) || (three > 0 && !(one > 0) && !(two > 0))) {
            System.out.println("1");
        } else if (!(one > 0) && !(two > 0) && !(three > 0)) {
            System.out.println("0");

        }
    }
}