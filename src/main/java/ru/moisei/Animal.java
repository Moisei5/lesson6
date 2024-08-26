package ru.moisei;

public class Animal {
    protected String name;
    protected int age;
    protected int run;
    protected int swimming;

    public void run() {
        if (this.run <= 100) {
            System.out.println("животное пробежало");
        }
    }

    public void swim() {
        System.out.println("проплыло");
    }
}
