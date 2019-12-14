package com.javarush.task.task05.task0502;


public class Cat {
    public int age;
    public int weight;
    public int strength;

    public int getAge() {
        return this.age;
    }

    public Cat() {
    System.out.println("Cat created without variables!");
    }

    public Cat(int years, int power) {
        this.age = years;
        this.strength = power;
        System.out.println("Cat created with variables!");
    }

    public boolean fight(Cat anotherCat) {
        int points = 0;
        if (anotherCat.age < this.age) {
            points++;
        }
        if (anotherCat.weight < this.weight) {
            points++;
        }
        if (anotherCat.strength < this.strength) {
            points++;
        }
        if (points >= 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Cat snow = new Cat();
        Cat rain = new Cat(5, 4);
        /*snow.age = 5;
        snow.weight = 12;
        snow.strength = 50;
        System.out.println(snow.getAge());
        Cat jon = new Cat();
        jon.age = 5;
        jon.weight = 15;
        jon.strength = 40;
        snow.fight(jon);*/


    }
}
