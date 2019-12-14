package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOne = reader.readLine();
        String nameTwo = reader.readLine();
        int lengthOne = nameOne.length();
        int lengthTwo = nameTwo.length();
        if (nameOne.equals(nameTwo)) {
            System.out.println("Имена идентичны");
        } else if (lengthOne == lengthTwo && (!nameOne.equals(nameTwo))) {
            System.out.println("Длины имен равны");
        }
    }
}
