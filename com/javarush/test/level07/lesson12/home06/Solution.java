package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gFather = new Human("Василий", true, 70, null, null);
        Human gMother = new Human("Валентина", false, 68, null, null);
        Human gFather1 = new Human("Иван", true, 75, null, null);
        Human gMother1 = new Human("Анна", false, 72, null, null);
        Human father1 = new Human("Алексей", true, 50, gFather, gMother);
        Human mother1 = new Human("Маргарита", false, 48, gFather1, gMother1);
        Human child1 = new Human("Сергей", true, 25, father1, mother1);
        Human child2 = new Human("Денис", true, 20, father1, mother1);
        Human child3 = new Human("Света", false, 18, father1,mother1);
        System.out.println(gFather);
        System.out.println(gFather1);
        System.out.println(gMother);
        System.out.println(gMother1);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        //напишите тут ваш код
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
                //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
