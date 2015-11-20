package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2d, "sds");
        labels.put(22d, "sds");
        labels.put(24d, "sds");
        labels.put(25d, "sds");
        labels.put(21d, "sds");
    }

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
