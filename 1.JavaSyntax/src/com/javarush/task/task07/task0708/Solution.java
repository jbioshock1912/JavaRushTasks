package com.javarush.task.task07.task0708;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.Reader;
        import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        strings = new ArrayList<String>();
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        for (String value : strings) {
            if (value.length() > max) {
                max = value.length();
            }
        }

        for (String parametr: strings) {
            if (parametr.length() == max) {
                System.out.println(parametr);
            }
        }
    }
}
