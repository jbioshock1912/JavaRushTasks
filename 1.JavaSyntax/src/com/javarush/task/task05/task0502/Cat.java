package com.javarush.task.task05.task0502;

// класс CCat с переменными класса возраст, веси, сила
public class Cat {
    public int age;
    public int weight;
    public int strength;
// метод класса Cat.  Метода вне класса не бывает!!!
    public int getAge() {
        return this.age;// возвращает переменную инт
    }
// конструктор без параметров
    public Cat() {
    System.out.println("Cat created without variables!");
    }
    // конструктор с параметрами. конструктор называется как класс, но  нет и не может быь возвращаемого значения
    public Cat(int years, int power) {
        this.age = years;
        this.strength = power;
        System.out.println("Cat created with variables!");
    }
// метод с одним параметром anotherCat типа Cat. Всё что внутри это переменные внутри метода. Переменные этого метода, не класса
    public boolean fight(Cat anotherCat) {
        int points = 0;
        if (anotherCat.age < this.age) { //вызыываем переменные класса
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
// void это означает что нт вовращаемого значения
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
