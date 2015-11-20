package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (file.available() > 0) {
            ls.add(file.read());
        }
        int max = 1;
        for (int i = 0; i < ls.size() ; i++) {
            int count = 0;
            for (int j = 0; j < ls.size() ; j++) {
                if (ls.get(i).equals(ls.get(j)))
                    count++;
            }
            if (count > max)
                max = count;
            map.put(ls.get(i), count);
        }


        for(Map.Entry<Integer, Integer> out : map.entrySet())
            if (out.getValue() == max)
                System.out.print(out.getKey() + " ");
        file.close();
        reader.close();
    }
}
