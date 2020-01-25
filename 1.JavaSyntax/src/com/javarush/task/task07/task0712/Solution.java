package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static int toFindShortList(ArrayList<String> searching) {
        int indexShort = 0;
        String word = searching.get(0);
        for (int i = 1; i < searching.size(); i++) {
            if (searching.get(i).length() < word.length()){
                word = searching.get(i);
                indexShort = i;
            }
        }
        return indexShort;
    }

    public static int toFindLongList(ArrayList<String> searching) {
        int indexLong = 0;
        String word = searching.get(0);
        for (int i = 1; i < searching.size(); i++) {
            if (searching.get(i).length() > word.length()) {
                word = searching.get(i);
                indexLong = i;
            }
        }
        return indexLong;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String word = reader.readLine();
            list.add(word);
        }

        if (Solution.toFindLongList(list) < Solution.toFindShortList(list)){
            System.out.println(list.get(toFindLongList(list)));
        }
        else {
            System.out.println(list.get(toFindShortList(list)));
        }


    }

}
