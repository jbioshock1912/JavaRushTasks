package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat snow = new Cat("snow", 7, 27, 40); //вопрос можно ли назвать кота снежком , а в конструкторе уэже запистаь другое имя??
        Cat winter = new Cat("winter", 10, 12, 90);
        Cat summer = new Cat("sunner", 0, 1, 2);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}