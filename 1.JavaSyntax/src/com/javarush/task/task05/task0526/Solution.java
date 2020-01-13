package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) {
        Woman girl = new Woman("julia", 29, "spb");
        Woman mother = new Woman("nina", 56, "kudrovo");
        Man boy = new Man("slava", 31, "kolpino");
        Man father = new Man("damir", 59, "tatar");
        System.out.println(girl);
        System.out.println(boy);
        System.out.println(mother);
        System.out.println(father);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
