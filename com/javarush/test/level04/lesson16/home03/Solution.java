package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isOne = false;
        int s = 0;
        while (!isOne){
        String nS = reader.readLine();
        int n = Integer.parseInt(nS);
            s = s + n;
            isOne = nS.equals("-1");

        }
        System.out.println(s);
        //напишите тут ваш код
    }
}
