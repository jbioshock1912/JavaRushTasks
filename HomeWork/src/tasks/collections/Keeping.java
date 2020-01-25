package tasks.collections;

import java.util.ArrayList;

public class Keeping {

    private static ArrayList<String> list = new ArrayList<>();
    ;  //форма записи прочитать что есть что

    private static void filing() {
        list.add("Юлек - огонек");
        list.add("Juliaэ");
        list.add("Юлек - огонек");
        list.add("fine");
        list.add("Юля okэ");
        list.add("Murashka");
        list.add("Julek");
        list.add("HardWooooooooorkэ");
        list.add("forest gamp kiэss youuuuuМурашка");
        list.add("julia foreverэ");
        list.add("Юля sabirchikМурашка");
        list.add("Юляшка mother father sister brotherМурашка");
    }

    private static void lengthMoreThanTen() {
        int count = 0;
        for (String value : list) {
            if (value.length() > 10) {
                count++;
            }
        }
        System.out.println("Число строк с длиной больше 10 равно: " + count);
    }

    private static void lengthMoreThanFiveLessTen() {
        int count = 0;
        for (String value : list) {
            if (value.length() > 5 && value.length() < 10) {
                count++;
            }
        }
        System.out.println("Число строк с длиной больше 5 и меньше 10 равно: " + count);
    }

    private static void toFindJulia() {
        int count = 0;
        for (String value : list) {
            if (value.startsWith("Юля")) {
                count++;
            }
        }
        System.out.println("Число строк, которые начинаются с имени \"Юля\" " + count);
    }

    private static void toFindMurashka() {
        int count = 0;
        for (String value : list) {
            if (value.endsWith("Мурашка")) {
                count++;
            }
        }
        System.out.println("Число строк, которые заканчиваются на имя \"Мурашка\" " + count);
    }

    private static void toFindLiter() {
        int count = 0;
        for (String value : list) {
            if (value.indexOf("э") > -1) {
                count++;
            }
        }
        System.out.println("Количество строк, где есть буква э равно: " + count);
    }

    private static void tofindJuliaFire() {
        int count = 0;
        for (String value : list) {
            if (value.equals("Юлек - огонек")) {
                count++;
            }
        }
        System.out.println("Количество строк, где есть Юлек - огонек равно: " + count);
    }

    private static void toFindMax() {
        int max = 0;
        for (String value : list) {
            if (value.length() >= max) {
                max = value.length();
            }
        }
        for (String value : list) {
            if (value.length() == max) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        Keeping.filing();
        Keeping.lengthMoreThanTen();
        Keeping.lengthMoreThanFiveLessTen();
        Keeping.toFindJulia();
        Keeping.toFindMurashka();
        Keeping.toFindLiter();
        Keeping.tofindJuliaFire();
        Keeping.toFindMax();
    }
}
