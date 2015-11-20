package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            for (User x : users){
                if (x.getFirstName() != null) {
                    printWriter.print("Yes");
                    printWriter.print(x.getFirstName() + ", ");
                }
                else printWriter.print("no");
                if (x.getLastName() != null){
                    printWriter.print("Yes");
                    printWriter.print(x.getLastName() + ", ");
                }
                else printWriter.print("no");
                if (x.getBirthDate() != null){
                    printWriter.print("Yes");
                    printWriter.print(x.getBirthDate() + ", ");
                }
                else printWriter.print("no");
                printWriter.print(x.isMale() + ", ");
                if (x.getCountry() != null){
                    printWriter.print("Yes");
                    printWriter.print(x.getCountry());
                }
                else printWriter.print("no");
            }
            printWriter.close();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            DataInputStream reader = new DataInputStream(inputStream);
            SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            String is;
            if((is = reader.readLine()) != null){
                User user = new User();
                String[] arr = is.split(", ");
                if (arr[0].equals("Yes"))
                    user.setFirstName(arr[1]);
                if (arr[2].equals("Yes"))
                    user.setLastName(arr[3]);
                if (arr[4].equals("Yes"))
                    user.setBirthDate(date.parse(arr[5]));
                if (arr[6].equals("true"))
                    user.setMale(true);
                if (arr[6].equals("false"))
                    user.setMale(false);
                if (arr[7].equals("Yes"))
                    user.setCountry(User.Country.valueOf(arr[8]));
                users.add(user);
            }
            reader.close();

            //implement this method - реализуйте этот метод
        }
    }
}
