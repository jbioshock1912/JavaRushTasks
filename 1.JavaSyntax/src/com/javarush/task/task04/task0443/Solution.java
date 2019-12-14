package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String yString = reader.readLine();
        int y = Integer.parseInt(yString);
        String mString = reader.readLine();
        int m = Integer.parseInt(mString);
        String dString = reader.readLine();
        int d = Integer.parseInt(dString);


        System.out.println("Меня зовут " + name +".");
        System.out.print("Я родился " + d + "." +m + "." + y);


    }
}
