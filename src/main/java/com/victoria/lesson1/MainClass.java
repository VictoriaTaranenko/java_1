package com.victoria.lesson1;

public class MainClass {
    public static void main(String[] args) {
        variableTypes();
        System.out.println(calculator(2, 5, 25, 5));
        System.out.println(sum(20, 0));
        positiveNumber(-3);
        System.out.println(negativeNumber(11));
        name("Вика");
        leapYear(1764);
    }

    public static void variableTypes() {
        byte b = 127;
        short sh = 32000;
        int a = 3056755;
        long l = 45984989L;

        float f = 123.2345f;
        double d = 1223.3345567899999;

        char c = '*';
        boolean boo = true;
        System.out.println(b + " " + sh + " " + a + " " + l + " " + f + " " + d + " " + c + " " + boo);

    }

    public static int calculator(int a, int b, int c, int d) {
        int result = (a * b + (c / d));
        return result;
    }

    public static boolean sum(int a, int b) {
        int res = a + b;
        if (res >= 10 && res <= 20) {
            return true;
        }
        return false;
    }

    public static void positiveNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean negativeNumber(int number) {
        if (number < 0) {
            return true;
        }
        return false;
    }

    public static void name(String name) {
        System.out.println("Привет " + name + "!");
    }

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year != 0) || year % 400 == 0) {
            System.out.println("Высокосный");
        } else {
            System.out.println("Не высокосный");
        }

    }


}
