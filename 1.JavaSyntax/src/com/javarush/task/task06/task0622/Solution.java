package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());
        int four = Integer.parseInt(reader.readLine());
        int five = Integer.parseInt(reader.readLine());
        array[0] = one;
        array[1] = two;
        array[2] = three;
        array[3] = four;
        array[4] = five;


       /* for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        int number = array[2];*/
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
