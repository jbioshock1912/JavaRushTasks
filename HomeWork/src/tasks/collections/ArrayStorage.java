package tasks.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStorage {
    private int[] number = new int[20];

    public void filing() {
        number[0] = 2;
        number[1] = 4;
        number[2] = 5;
        number[3] = 4;
        number[4] = 99;
        number[5] = 1000;
        number[6] = 25444;
        number[7] = 4;
        number[8] = 43;
        number[9] = -100;
        number[10] = -200;
        number[12] = -44;
        number[13] = -10;
        number[14] = 13;
        number[15] = 13333;
        number[16] = 30;
        number[17] = 7;
        number[18] = 53;
        number[19] = 3330;
    }


    public void toFindMoreThirty() {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 30) {
                count++;
            }
        }
        System.out.println("Количество чисел больше 30: " + count);

    }

    public void toFindMoreFiveLessThirty() {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 5 && number[i] < 30) {
                count++;
            }
        }
        System.out.println("Количество чисел больше 5 и меньше 30 равно: " + count);
    }

    public void toFindEvenOdd() {
        int even = 0, odd = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Количество четных чисел в массиве равно: " + even + " , количество нечетных чисел в массиве равно:" + odd);
    }

    public void toDivideByThree() {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("Количество числе, которые делятся на три без оставтка: " + count);
    }

    public void toFindFigure() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int figure = Integer.parseInt(reader.readLine());
        for (int i = 0; i < number.length; i++) {
            if (number[i] == figure) {
                System.out.println("Введенное число " + figure + " существует в списке.");
                break;
            }
        }
    }

    public void toSquare() {
        System.out.println("новый массив: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] * number[i];
            System.out.println(number[i]);
        }
    }

    public void toRightShift() {
        int memory = 0;
        System.out.println("Массив со сдвигом вправо:");
        for (int i = 0; i < number.length - 1; i++) {
            memory = number[i];
            number[i] = number[i + 1];
            System.out.println(number[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayStorage storage = new ArrayStorage();
        storage.filing();
        storage.toFindMoreThirty();
        storage.toFindMoreFiveLessThirty();
        storage.toFindEvenOdd();
        storage.toDivideByThree();
        storage.toFindFigure();
        storage.toSquare();
        storage.toRightShift();
    }
}
