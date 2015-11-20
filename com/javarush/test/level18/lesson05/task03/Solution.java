package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());
        if (file1.available() % 2 == 0){
            byte[] buf1 = new byte[file1.available() / 2];
        byte[] buf2 = new byte[file1.available() / 2];
            int count = file1.read(buf1);
            int count1 = file1.read(buf2);

            file2.write(buf1, 0, count);
        file3.write(buf2, file1.available() / 2, count1);}
        else {

            byte[] buf1 = new byte[file1.available() / 2 + 1];
            byte[] buf2 = new byte[file1.available() / 2];
            int count = file1.read(buf1);
            int count1 = file1.read(buf2);
            file2.write(buf1, 0, count);
            file3.write(buf2, file1.available() / 2, count1);
        }




     /*   ArrayList<Integer> ls = new ArrayList<Integer>();
        while (file1.available() > 0)
            ls.add(file1.read());
        int flag;
        flag = ls.size() % 2 != 0 ? 1 : 0;
        for (int i = 0; i < ls.size() / 2 + flag; i++) {
            file2.write(ls.get(i));
        }
        for (int i = ls.size() / 2 + flag; i < ls.size() ; i++) {
            file3.write(ls.get(i));
        }*/
        file1.close();
        file2.close();
        file3.close();
        reader.close();

    }
}
