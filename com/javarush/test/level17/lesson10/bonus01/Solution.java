package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        switch (args[0]){
            case "-d" : {
                    Person person = allPeople.get(Integer.parseInt(args[1]));
                    person.setName(null);
                    person.setBirthDay(null);
                    person.setSex(null);
                break;
                }
            case "-i" : {
                    Person person = allPeople.get(Integer.parseInt(args[1]));
                    String sex = person.getSex() == Sex.MALE ? "м" : "ж";
                    System.out.println(person.getName() + " "  + sex + " " + dateOut.format(person.getBirthDay()));

                break;}

            case "-c" : {
                if (args[0].equals("-c")){
                Person person;
                if (args.length == 4){
                if (args[2].equals(Sex.MALE))
                    person = Person.createMale(args[1],date.parse(args[3]));
                else
                person = Person.createFemale(args[1],date.parse(args[3]));
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));}
                else if (args.length == 5) {
                    if (args[3].equals(Sex.MALE))
                        person = Person.createMale(args[1] + " " + args[2],date.parse(args[3]));
                    else
                        person = Person.createFemale(args[1] + " " + args[2],date.parse(args[3]));
                    allPeople.add(person);
                    System.out.println(allPeople.indexOf(person));}

                }

                break;
            }
            case "-u" : {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                person.setBirthDay(date.parse(args[4]));}

            default: return;
        }


        //start here - начни тут
    }
}
