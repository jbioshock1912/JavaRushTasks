package tasks.calculator;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HardCounter {
    static double currentResult = 0;
    static int buttonMenu = 0;

    public static void main(String[] args) throws IOException {
        HardCounter counter = new HardCounter();
        counter.toEnterNumber();
        counter.startCalculator();
    }

    public void startCalculator() throws IOException {
        while (!(buttonMenu == 12)) {
            printMenu();
            checkCalculatorCommand();
        }
    }

    public void checkCalculatorCommand() throws IOException {
        if (buttonMenu == 1) {
            summation();
        } else if (buttonMenu == 2) {
            subtraction();
        } else if (buttonMenu == 3) {
            multiplication();
        } else if (buttonMenu == 4) {
            division();
        } else if (buttonMenu == 5) {
            modulsDivision();
        } else if (buttonMenu == 6) {
            toFindSquare();
        } else if (buttonMenu == 7) {
            toFindСos();
        } else if (buttonMenu == 8) {
            toInverse();
        } else if (buttonMenu == 9) {
            exponentiation();
        } else if (buttonMenu == 10) {
            module();
        } else if (buttonMenu == 11) {
            finish();
        }
    }

    public void toEnterNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число для дальнейших математических действий");
        double number = Integer.parseInt(reader.readLine());
        currentResult = number;
    }

    public static void toEnterTask() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите команду для дальнейших математических действий");
        double number = Integer.parseInt(reader.readLine());
    }

    public void printMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите команду и введите соответствующую кнопку на клавиатуре");
        System.out.println("1) +");
        System.out.println("2) - ");
        System.out.println("3) *");
        System.out.println("4) /");
        System.out.println("5) %");
        System.out.println("6) sqrt");
        System.out.println("7) cos");
        System.out.println("8) 1/x");
        System.out.println("9) pow");
        System.out.println("10) abs");
        System.out.println("11) Сбросить результат");
        System.out.println("12) завершить работу");
        buttonMenu = Integer.parseInt(reader.readLine());
    }

    public void summation() throws IOException {
        System.out.println("введите второе число для суммирования");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double secondNumber = Double.parseDouble(reader.readLine());
        currentResult = currentResult + secondNumber;
        System.out.println("результат суммирования равен " + currentResult);
    }

    public void subtraction() throws IOException {
        System.out.println("введите второе число для вычитания");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double secondNumber = Double.parseDouble(reader.readLine());
        currentResult = currentResult - secondNumber;
        System.out.println("результат вычитания равен " + currentResult);
    }

    public void multiplication() throws IOException {
        System.out.println("введите второе число для умножения");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double secondNumber = Double.parseDouble(reader.readLine());
        currentResult = currentResult * secondNumber;
        System.out.println("результат произведения равен " + currentResult);
    }

    public void division() throws IOException {
        System.out.println("введите второе число для деления, кроме нуля");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double secondNumber = Double.parseDouble(reader.readLine());
        currentResult = currentResult / secondNumber;
        System.out.println("результат деления равен " + currentResult);
    }

    public void modulsDivision() throws IOException {
        System.out.println("введите второе число для деления по модулю");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double secondNumber = Double.parseDouble(reader.readLine());
        currentResult = currentResult % secondNumber;
        System.out.println("остаток от деления равен " + currentResult);
    }

    public void toFindSquare() {
        currentResult = Math.sqrt(currentResult);
        System.out.println("квадратный корень равен " + currentResult);
    }

    public void toFindСos() {
        currentResult = Math.cos(currentResult);
        System.out.println("косинус равен " + currentResult);
    }

    public void toInverse() {
        currentResult = 1 / currentResult;
        System.out.println("обратное число равно " + currentResult);
    }

    public void exponentiation() throws IOException {
        System.out.println("введите второе число для определения степени");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double secondNumber = Double.parseDouble(reader.readLine());
        currentResult = Math.pow(currentResult, secondNumber);
        System.out.println("результат возведения в степень равен " + currentResult);
    }

    public void module() {
        currentResult = Math.abs(currentResult);
        System.out.println("модуль числа равен " + currentResult);
    }

    public void finish() {
        currentResult = 0;
        System.out.println("сброс результата, значение -  " + currentResult);
    }
}


