package com.javarush.test.level09.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] m1 = {4, 2, 8, 5, 3};
        int[] m2 = {4, 2};
        int[] m3 = {4, 2, 8, 5};
        int[] m4 = {4, 2, 8, 5, 3, 2, 4};
        int[] m5 = {};
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        return list;    //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
