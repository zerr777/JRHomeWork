package com.javarush.test.level08.lesson11.home02;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static class Cat {
        private String name;
        public Cat(String name){
            this.name = name;
        }
    }
    public static class Dog {
        private String name;
        public Dog(String name){
            this.name = name;
        }
    }
    public static class Pets {
        public String name;
    }
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();
        Cat cat1 = new Cat("Vaska");Cat cat2 = new Cat("Kot"); Cat cat3 = new Cat("Mur"); Cat cat4 = new Cat("Puh");
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(new Dog("Dog2"));
        result.add(new Dog("Dog"));
        result.add(new Dog("Dog3"));
        //напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
         Set<Object> pets = new HashSet<Object>();
            pets.addAll(cats);
            pets.addAll(dogs);
        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        for (Cat x : cats)
            pets.remove(x);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object x : pets)
            System.out.println(x);
        //напишите тут ваш код
    }

    //напишите тут ваш код
}
