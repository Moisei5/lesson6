package ru.moisei;

public class Animal {
    protected String name;
    private final int MAX_SWIM = 10;
    private final int MAX_RUN = 500;

    public void run(int runing) {
        if (runing <= MAX_RUN) {
            System.out.println("животное пробежало");
        }
    }

    public void swim(int swimming) {
        if (swimming <= MAX_SWIM) {
            System.out.println("проплыло");
        }
    }
}
