package com.javarush.task.task01.task0130;

/*
Наш первый конвертер!
*/

public class Solution {

    public static void main(String[] args) {
       System.out.println(convertCelsiusToFahrenheit(41));
        //System.out.println(9/5);
        //System.out.println(9/5.0);
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
      double tf ;
      tf = 9/5.0 * celsius + 32;

      return  tf;     //напишите тут ваш код
    }
}