package ru.moisei;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;

    }
    private final int MAX_SWIM = 10;
    private final int MAX_RUN = 500;
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
            System.out.println(name + " проплыл " + swimming);
        } else {
            System.out.println(name + " не может проплыть " + swimming);
        }
    }
}
