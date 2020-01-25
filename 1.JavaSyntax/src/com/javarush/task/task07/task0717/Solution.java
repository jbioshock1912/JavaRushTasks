package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String word = reader.readLine();
            list.add(word);
        }

        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doublelist = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            doublelist.add(word);
            doublelist.add(word);
        }
        return doublelist;
    }
}
