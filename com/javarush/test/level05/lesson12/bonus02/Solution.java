package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);
        int minimum1 = min(c, d);
        int minimum2 = min(minimum, e);
        int mini1 = min(minimum, minimum1);
        int mini2 = min(minimum2, minimum1);
        int mini = min(mini1, mini2);

        System.out.println("Minimum = " + mini);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

}
