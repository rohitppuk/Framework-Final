package com.homework.inheritance;

public class RunMe {

    public static void main(String[] args) {
        Cheeta c = new Cheeta();
        elephant e = new elephant();
        System.out.println("Cheetah--->");
        c.leave();
        c.food();
        c.fly();
        System.out.println("Elephant-->");
        e.leave();
        e.food();
        e.fly();

    }
}
