package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int qe = Integer.parseInt(reader.readLine());
        if (qe > 0) {
            int first = Integer.parseInt(reader.readLine());
            for (int i = 1; i <= qe - 1; i++) {
                int w = Integer.parseInt(reader.readLine()); // ))))))
                if (w > first) {
                    first = w;
                }
            }
            int maximum = first;
            System.out.print(maximum);
            //напишите тут ваш код
        }
    }
}
