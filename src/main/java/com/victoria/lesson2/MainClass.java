package com.victoria.lesson2;
/* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. [1,1,0,0,1,0,1,1,0,0].
      С помощью цикла и условия заменить 0 на 1, 1 на 0  */
/* 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями
      0 3 6 9 12 15 18 21 */
/* 3. Задать массив [1,5,3,2,11,4,5,2,4,8,9,1] пройти по нему циклом, и числа меньшие 6 умножить на 2 */
/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и
      с помощью цикла заполнить его диагональные элементы единицами*/
/* 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы */


import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        integerArray();
        emptyIntegerArray();
        numbers();
        squareArrays();
        maxMinArrays();

    }

    public static void integerArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void emptyIntegerArray() {
        int [] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void numbers() {
        int[] number = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 6) {
                number[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(number));
    }

    public static void squareArrays() {
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i] == array[j]) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void maxMinArrays() {
        int [] arr = {5,9,1,3,12,88,17,6,4,3};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min: " + min + " max: " + max);
    }
}
