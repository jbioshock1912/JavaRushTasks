package com.javarush.task.task03.task0314;
public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int n = 0;
            while (n < 9 )
            {
                System.out.print((i + 1)*(n+1) + " ");
                n ++;
            }
            System.out.println((i + 1)*(n+1) + " ");

            i++;



        }
    }
}
