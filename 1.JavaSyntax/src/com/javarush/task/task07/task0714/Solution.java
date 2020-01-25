package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> wordlist = new ArrayList<String>();
        for (int i = 0; i <5; i ++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String word = reader.readLine();
            wordlist.add(word);
        }
        wordlist.remove(2);
       for (int i = wordlist.size() - 1; i >= 0; i --) {
           System.out.println(wordlist.get(i));
       }
    }
}
