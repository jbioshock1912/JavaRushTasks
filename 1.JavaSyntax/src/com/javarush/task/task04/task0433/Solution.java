package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {

        int n = 1;
        String s = "S";
        while (n < 11)

            {int i = 2;
                while (i<11)
                {
                    System.out.print(s);
                i++;
                    }
            System.out.println(s);
            n++;
        }
    }
}

