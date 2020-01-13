package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("tom", 12, 50);
        Dog spikeDog = new Dog("spike", 55, 150);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int age;
        int strong;

        public Dog(String name, int age, int strong) {
            this.name = name;
            this.age = age;
            this.strong = strong;
        }
    }

    public static class Cat {
        String name;
        int age;
        int strong;

        public Cat(String name, int age, int strong) {
            this.name = name;
            this.age = age;
            this.strong = strong;
        }
    }
}
