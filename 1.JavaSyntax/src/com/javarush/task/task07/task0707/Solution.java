package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("vaska");
        list.add("vaska");
        list.add("vaska");
        list.add("vaska");
        list.add("vaska");
        System.out.println(list.size());
        for (String value: list) {
            System.out.println(value);
        }
    }
}
