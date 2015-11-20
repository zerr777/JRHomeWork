package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        String str = "callto://+380501234567";
        String num = str.replaceAll("\\D", "");
        System.out.println("+" + num.substring(0, 2)+ "(" + num.substring(2,5) + ")" + num.substring(5,8) +"-" + num.substring(8,10)+ "-" + num.substring(10));
    }
}
