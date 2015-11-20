package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mS = reader.readLine(), nS = reader.readLine();
        int m = Integer.parseInt(mS), n = Integer.parseInt(nS);
        for (int i = 0; i < m ; i++) {
            System.out.println();

            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }

        }
        //напишите тут ваш код

    }
}
