package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        for (int a = 0; a < 101; a++)
        {
            if (a % 2 == 0 && !(a==0))
                System.out.println(a);

        }


    }
}
