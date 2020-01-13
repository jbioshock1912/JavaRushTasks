package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        int i = 0;
        String result = "";
        while (i < count) {
            result += s;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        //String qwer = StringHelper.multiply("vasya", 10);
        System.out.println(StringHelper.multiply("vasya", 2) + StringHelper.multiply("olya", 2));
    }
}

