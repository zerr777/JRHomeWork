package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Zerr on 22.10.2015.
 */
public class Plane implements Flyable {
    public static int passanger;
    @Override
    public void fly() {

    }
    public Plane(int passanger) {
        this.passanger = passanger;
    }

}
