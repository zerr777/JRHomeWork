package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = reader.readLine(), bS = reader.readLine(), cS = reader.readLine(), dS = reader.readLine();
        int a = Integer.parseInt(aS), b = Integer.parseInt(bS), c = Integer.parseInt(cS), d = Integer.parseInt(dS);
        if (a > b && a > c && a > d)
            System.out.println(a);
        else
            if (b > a && b > c && b > d)
                System.out.print(b);
                else
                if (c > a && c > b && c > d)
                    System.out.print(c);
        else
                    System.out.print(d);

        //напишите тут ваш код

    }
}
