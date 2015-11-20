package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] b = new int[20];
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        for (int i = 0; i < b.length ; i++) {
            b[i] = Integer.parseInt(r.readLine());
        }
        for (int i = 0; i < b.length ; i++) {
            if (i >= 10)
                a2[i - a2.length] = b[i];
            else
                a1[i] = b[i];
            }
        for (int i = 0; i < a2.length ; i++) {
            System.out.println(a2[i]);

        }
        //напишите тут ваш код

    }
}
