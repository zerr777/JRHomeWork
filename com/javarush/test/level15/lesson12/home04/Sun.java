package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Zerr on 21.10.2015.
 */
public class Sun implements Planet{
    private static Sun ourInstance = new Sun();

    public static Sun getInstance() {
        return ourInstance;
    }

    private Sun() {
    }
}
