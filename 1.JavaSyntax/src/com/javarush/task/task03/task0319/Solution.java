package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String chislo = reader.readLine();
        int chislo1 = Integer.parseInt(chislo);
        String snivacheslo = reader.readLine();
        int cheslo = Integer.parseInt(snivacheslo);
        System.out.println(name + " получает " + chislo + " через " + cheslo + " лет.");


    }
}
