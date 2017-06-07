package com.kitcenter.runners.homework.lesson10;

import java.util.Scanner;

/**
 * Created by denis on 5/31/17.
 */
public class HomeTaskRunner {
    public static void main(String[] args) {

            System.out.println("Homework menu:\n\nTask a = # 1\nTask b = # 2\nTask c = # 3\nTask d = # 4");

            System.out.println("\nPlease, type a number of task to see whole description:");
            Scanner homeWork = new Scanner(System.in);
            int result = homeWork.nextInt();

            switch (result) {

                case 1:
                    System.out.println("a. Сделать HomeTaskRunner который будет вызывать меню со всеми домашними заданиями к уроку");
                break;

                case 2:
                    System.out.println("b. Реализовать считывание сроки, которую введет пользователь.  Придумать и написать в коде 3 алгоритма определения ее палиндромности (можно ли читать ее задом наперед так же, как и в прямом порядке). Сравнение должно быть case-insensitive (то-есть слово Moom и moom должны быть оба палиндромами).");
                break;

                case 3:
                    System.out.println("c. *** Реализовать считывание сроки, которую введет пользователь.  Придумать и написать в коде 5 алгоритмов определения ее палиндромности (включая 3 из предидущей задачи).");
                break;

                case 4:
                    System.out.println("d. Создать раннеры для каждого ДЗ. Создать меню для запуска каждого пункта из каждого ДЗ. Все раннеры назвать как Hometask{номер домашней работы} и поместить в package runners.");
                break;
            }

    }
}
