package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chisloString = reader.readLine();
        int chislo = Integer.parseInt(chisloString);
        if (chislo > 0) {
            System.out.println(chislo * 2);}
        else
            if (chislo < 0) {
                System.out.println(chislo + 1);
                //напишите тут ваш код

            } else {
                System.out.println(chislo);

            }
        }
    }
