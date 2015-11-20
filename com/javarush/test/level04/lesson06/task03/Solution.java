package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = reader.readLine(),bS = reader.readLine(), cS = reader.readLine();
        int a = Integer.parseInt(aS), b = Integer.parseInt(bS), c = Integer.parseInt(cS);
        if (a < b && a < c)
            if (b < c){
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);}

            else {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        else
            if (b < a && b < c)
                if (a < c){
                    System.out.println(c);
                    System.out.println(a);
                    System.out.println(b);}
                else {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);}
            else
                if (a < b)
                {
                    System.out.println(b);
                    System.out.println(a);
                    System.out.println(c);
                }
                else {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }
        //напишите тут ваш код
    }
}
