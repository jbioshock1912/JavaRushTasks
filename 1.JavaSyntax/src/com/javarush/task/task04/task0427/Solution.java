package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chisloString = reader.readLine();
        int chislo = Integer.parseInt(chisloString);
        if (chislo < 10 && chislo % 2 == 0 && chislo>0) {
            System.out.println("четное однозначное число");

        } else if (chislo < 10 && chislo % 2 == 1 && chislo>0) {
            System.out.println("нечетное однозначное число");
        } else if (chislo > 9 && chislo < 100 && chislo % 2 == 0) {
            System.out.println("четное двузначное число");
        } else if (chislo > 9 && chislo < 100 && chislo % 2 == 1) {
            System.out.println("нечетное двузначное число");
        } else if (chislo > 99 && chislo < 1000 && chislo % 2 == 0) {
            System.out.println("четное трехзначное число");
        } else if (chislo > 99 && chislo < 1000 && chislo % 2 == 1) {
            System.out.println("нечетное трехзначное число");
        } else {


            }
        }
    }

