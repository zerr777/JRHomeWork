package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        FileInputStream reader = new FileInputStream(args[0]);
        int all = reader.available();
        int spacesCount=0;
        while (reader.available()>0)
        {
            if ( (char)reader.read() == ' ')
                spacesCount++;
        }
        double d = (double)spacesCount/all*100;
        d = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(d);
        reader.close();
    }
}
