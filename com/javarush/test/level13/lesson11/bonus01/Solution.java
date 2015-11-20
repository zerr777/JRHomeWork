package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException, InputMismatchException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner file = new Scanner(new File(reader.readLine()));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (file.hasNext()){
            list.add(file.nextInt());
        }
        file.close();
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 ; j++) {
                   if (list.get(j) > list.get(j + 1)) {
                        int temp = list.get(j + 1);
                        list.set(j + 1, list.get(j));
                        list.set(j, temp);
                        }
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) % 2 == 0)
                output.add(list.get(i));

        }
        for (int i = 0; i < output.size() ; i++) {
            System.out.println(output.get(i));
        }
        // напишите тут ваш код
    }
}
