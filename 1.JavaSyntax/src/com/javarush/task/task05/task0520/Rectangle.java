package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
   int left;
   int top;
   int width;
   int height;

   public Rectangle (int left){
       this.left = left;
   }
    public Rectangle (int top, int width){
       this.top = top;
       this.width = width;
    }

    public Rectangle (int top, int width, int height){
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle (int left, int top, int width, int height){
       this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
