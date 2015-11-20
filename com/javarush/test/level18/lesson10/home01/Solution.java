package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
            String in = args[0];
            FileInputStream file = new FileInputStream(in);
            String alphabet = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        int letterAmount=0, byteSimbol;
        while ((byteSimbol=file.read())!=-1) {
            if (alphabet.contains((char) byteSimbol + "")) letterAmount++;

        }
        file.close();
        System.out.println(letterAmount);
        }
}
