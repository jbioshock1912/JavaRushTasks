package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        //System.out.println(date);
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
    }
}
