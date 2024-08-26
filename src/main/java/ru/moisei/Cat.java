package ru.moisei;

public class Cat extends Animal {
    public Cat(String name, int age, int run, int swimming) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.swimming = swimming;
    }

    public void run() {
        if (this.run <= 200) {
            System.out.print(name + " " + age + " пробежал " + this.run);
        } else {
            System.out.print(name + " " + age + " не может столько пробежать " + this.run);
        }
    }

    public void swim() {
        if (this.swimming <= 1) {
            System.out.println(" ");
        } else {
            System.out.println(", не умеет плавать");
        }
    }
}