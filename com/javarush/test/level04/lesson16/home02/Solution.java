package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = reader.readLine(), bS = reader.readLine(), cS = reader.readLine();
        int a = Integer.parseInt(aS), b = Integer.parseInt(bS), c = Integer.parseInt(cS);
        if (a < b && a < c)
            if (b < c)
                System.out.println(b);
            else System.out.println(c);
        else
            if (b < c && b < a)
                if (c < a)
                    System.out.println(c);
                else System.out.println(a);
            else
                if (b < a)
                    System.out.println(b);
                else System.out.println(a);
        //напишите тут ваш код
    }
}
