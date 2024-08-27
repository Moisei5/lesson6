package ru.moisei;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;

    }
    private final int MAX_SWIM = 0;
    private final int MAX_RUN = 200;
    @Override
    public void run(int runing) {
        if (runing <= MAX_RUN) {
            System.out.println(name + " пробежал " + runing);
        } else {
            System.out.println(name + " не может столько пробежать " + runing);
        }
    }

    public void swim(int swimming) {
        if (swimming <= MAX_SWIM) {
            System.out.println(" ");
        } else {
            System.out.println(name + " не умеет плавать");
        }
    }
}