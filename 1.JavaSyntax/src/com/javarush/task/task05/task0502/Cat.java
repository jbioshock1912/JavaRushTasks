package com.javarush.task.task05.task0502;

// класс CCat с переменными класса возраст, веси, сила
public class Cat {
    public int age;
    public int weight;
    public int strength;
// метод класса Cat.  Метода вне класса не бывает!!!

    // конструктор без параметров
    public Cat() {
    }

    // метод с одним параметром anotherCat типа Cat. Всё что внутри это переменные внутри метода. Переменные этого метода, не класса
    public boolean fight(Cat anotherCat) {
        int points = 0;
        int pointsAnother = 0;

        if (anotherCat.age < this.age) { //вызыываем переменные класса
            points++;
        } else if (anotherCat.age == this.age) {
            points++;
            pointsAnother++;
        } else {
            pointsAnother++;
        }

        if (anotherCat.weight < this.weight) {
            points++;
        } else if (anotherCat.weight == this.weight) {
            points++;
            pointsAnother++;
        } else {
            pointsAnother++;
        }

        if (anotherCat.strength < this.strength) {
            points++;
        } else if (anotherCat.strength == this.strength) {
            points++;
            pointsAnother++;
        } else {
            pointsAnother++;
        }

        if (points > pointsAnother) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat snow = new Cat();
        snow.age = 5;
        snow.weight = 12;
        snow.strength = 50;
        Cat jon = new Cat();
        jon.age = 5;
        jon.weight = 15;
        jon.strength = 40;
        System.out.println(snow.fight(jon));
        System.out.println(jon.fight(snow));
    }

}
