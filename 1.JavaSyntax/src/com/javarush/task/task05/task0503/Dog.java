package com.javarush.task.task05.task0503;


public class Dog {
    String na;
    int age;

    public String getName() {
        return na;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.na = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dog winter = new Dog();
        winter.setName("julia");
    }
}
