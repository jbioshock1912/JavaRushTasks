package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import javax.swing.*;
import java.io.*;
import java.sql.SQLOutput;
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
        if (one == two && two == three && one == three) {
            System.out.println(one + " " + two + " " + three);
        } else {
            if (one == three) {
                System.out.println(one + " " + three);
            } else if (two == three) {
                System.out.println(two + " " + three);
            } else {
                if (one == two && two == three && one == three) {
                    System.out.println(one + " " + two + " " + three);
                }
                if (one == two) {
                    System.out.println(one + " " + two);


                }
            }

        }
    }
}