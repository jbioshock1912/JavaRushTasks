package com.javarush.task.task04.task0424;

/* 
Три числа
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
        if (one == two && !(one == three)) {
            System.out.println("3");
        }
        else if (one == three && !(one == two)) {
            System.out.println("2");
        } else if (two == three && !(one == two)) {
            System.out.println("1");
        }

    }
}
