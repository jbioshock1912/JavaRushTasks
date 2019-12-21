package tasks.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counter {

    static double result = 0;


    public void sum(double first, double second) throws IOException {
        double total = first + second;
        System.out.println(first + " + " + second + " = " + total);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сохранить результат в итоговом значении?");
        String save = reader.readLine();
        String answer;
        answer = save;
        if (answer.toLowerCase().equals("yes")) {
            result = total;
            System.out.println(result);
        }

    }


    public void mult(double first, double second) throws IOException {
        double total = first * second;
        System.out.println(first + " * " + second + " = " + total);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сохранить результат в итоговом значении?");
        String save = reader.readLine();
        String answer;
        answer = save;
        if (answer.toLowerCase().equals("yes")) {
            result = total;
            System.out.println(result);
        }
    }

    public void minus(double first, double second) throws IOException {
        double total = first * second;
        System.out.println(first + " - " + second + " = " + total);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сохранить результат в итоговом значении?");
        String save = reader.readLine();
        String answer;
        answer = save;
        if (answer.toLowerCase().equals("yes")) {
            result = total;
            System.out.println(result);
        }
    }

    public void div(double first, double second) throws IOException {
        double total = first - second;
        System.out.println(first + " / " + second + " = " + total);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сохранить результат в итоговом значении?");
        String save = reader.readLine();
        String answer;
        answer = save;
        if (answer.toLowerCase().equals("yes")) {
            result = total;
            System.out.println(result);
        }
    }


    public static void main(String[] args) throws IOException {
        Counter simple = new Counter();
        simple.sum(2, 3);
    }

}



