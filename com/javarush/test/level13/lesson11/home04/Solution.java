package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String source = reader.readLine();
        FileWriter file = new FileWriter(source, false);
        String s = "";
        while (true){
            String temp = reader.readLine();
            if (temp.equals("exit")){
                s += temp + System.lineSeparator();

                break;}
            else {
            s += temp + System.lineSeparator();
            }
        }
        file.write(s);
        file.close();

    }
}
