package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private int age;
        private boolean sex;
        private String national;
        private String born;
        private int inn;

        public Human(String name) {this.name = name;}
        public Human(String name, int age) {this.name = name; this.age = age;}
        public Human(String name, int age, boolean sex) {this.name = name; this.age = age; this.sex = sex;}
        public Human(String name, int age, boolean sex, String national) {this.name = name; this.age = age; this.sex = sex; this.national = national;}
        public Human(String name, int age, boolean sex, String national, String born) {this.name = name; this.age = age; this.sex = sex; this.national = national; this.born = born;}
        public Human(String name, int age, boolean sex, String national, String born, int inn) {this.name = name; this.age = age; this.sex = sex; this.national = national; this.born = born; this.inn = inn;}
        public Human(String name, boolean sex) {this.name = name; this.sex = sex;}
        public Human(boolean sex, int age) {this.sex = sex; this.age = age;}
        public Human(String name, String national, boolean sex) { this.name = name; this.national = national; this.sex = sex;}
        public Human(String name, String born, int age, boolean sex) { this.name = name; this.born = born; this.age = age; this.sex = sex;}
        //напишите тут ваши переменные и конструкторы
    }
}
