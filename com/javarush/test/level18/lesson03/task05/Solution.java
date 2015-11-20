package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        while (file.available() > 0){
            mp.put(file.read(), 1);}
        for (Map.Entry<Integer, Integer> tmp : mp.entrySet())
        ls.add(tmp.getKey());

        for (int i = 0; i < ls.size() ; i++) {
            for (int j = 0; j < ls.size() - 1; j++) {
                if (ls.get(j + 1) < ls.get(j)){
                    Integer x = ls.get(j + 1);
                    ls.set(j + 1, ls.get(j));
                    ls.set(j, x);}
            }
        }
        for (Integer list : ls)
            System.out.print(list + " ");
    file.close();
        reader.close();
    }
}
