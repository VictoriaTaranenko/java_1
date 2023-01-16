package com.victoria.lesson3;

import java.util.Random;
import java.util.Scanner;

/* 1. Написать программу, которая загадывает случайное число от 0 до 9, и дает пользователю 3 попытки
      угадать его. После каждой попытки компьютер должен сообщить больше ли указанное пользователем число
      чем загаданное или меньше.
   2. Создать массив из слов
      string [] words = {apple, orange, lemon, banana, apricot, avocado, broccoli, carrot, cherry, garlic,
      grape, melon, leak,kiwi, mango, mushroom, nut, olive, pea, peanut, pepper, pineapple, pumpkin, potato};
      При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает
      его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
      компьютер показывает буквы которые стоят на своих местах.
        apple - загаданное слово
        apricot - ответ игрока
        ap###############(15 символов, чтобы пользователь не мог узнать длину слова)
      для сравнения двух слов посимвольно модно пользоваться
      String[] str = "apple";
      str.charAt(0), метод вернет char который стоит в слове на первой позиции.
      Играем до тех пор , пока игрок не угадает слово.
      Используем только маленькие буквы.*/
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        randomNumber();
        hiddenWorld();
    }

    public static void randomNumber() {
        int hiddenNumber = random.nextInt(10);// загаданное  число
        System.out.println("Угадайте число от 0 до 10.");
        for (int i = 2; i >= 0; i--) {
            int guessedNumber = sc.nextInt(); //угаданное число
            if (hiddenNumber == guessedNumber) {
                System.out.println("Вы угадали");
                break;
            } else if (hiddenNumber < guessedNumber) {
                System.out.println("Загаданное число меньше. Повторите попытку, у вас осталось попыток: " + i);
            } else {
                System.out.println("Загаданное число больше . Повторите попытку, у вас осталось попыток: " + i);
            }
        }

    }

    public static void hiddenWorld() {
        String [] words = {"apple", "orange" , "lemon" , "banana" , "apricot" , "avocado" , "broccoli",
                           "carrot" , "cherry" , "garlic" , "grape" , "melon" , "leak" , "kiwi" , "mango" ,
                           "mushroom" , "nut" , "olive" , "pea" , "peanut" , "pepper" , "pineapple" , "pumpkin" , "potato" };
        String question = words[random.nextInt(words.length)];

        while(true) {
            System.out.println("Попробуйте угадать слово");
            String answer = sc.next();
            if(question.equals(answer)) {
                System.out.println("Вы победили!!!");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if(i < answer.length() && i < question.length() && question.charAt(i) == answer.charAt(i)) {
                        System.out.print(question.charAt(i));
                    } else {
                        System.out.print('#');
                    }
                }
                System.out.println();
            }


        }
    }





















}
