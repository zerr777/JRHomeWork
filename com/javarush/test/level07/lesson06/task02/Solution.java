package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
       ArrayList<String> str = new ArrayList<String>();
       ArrayList<String> strT = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            str.add(r.readLine());
        }
        strT.add(str.get(0));
        int x = 0;
        for (int i = 0; i < str.size() ; i++) {
            int j = 0;
        if (strT.get(j).length() < str.get(i).length()){
           // strT.remove(j);
            strT.set(j, str.get(i));
            j++;
            x = i+1;
            }
        }
        for (int i = x; i < str.size(); i++) {
            if (strT.get(0).length() == str.get(i).length())
                strT.add(str.get(i));
        }

        for (int i = 0; i < strT.size() ; i++) {
            System.out.println(strT.get(i));
        }
        //напишите тут ваш код

    }
}
