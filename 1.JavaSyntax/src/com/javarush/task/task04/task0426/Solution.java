package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chisloString = reader.readLine();
        int chislo = Integer.parseInt(chisloString);
        if (chislo < 0 && chislo % 2 == 0) {
            System.out.println("отрицательное четное число");

        } else if (chislo < 0 && chislo % 2 == (-1)) {
            System.out.println("отрицательное нечетное число");
        } else if (chislo == 0) {
            System.out.println("ноль");
        } else if (chislo > 0 && chislo % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (chislo > 0 && chislo % 2 == 1) {
            System.out.println("положительное нечетное число");
        }
    }
}

