package ru.moisei;

public class Dog extends Animal {
    public Dog(String name, int age, int run, int swimming) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.swimming = swimming;
    }

    public void run() {
        if (this.run <= 500) {
            System.out.print(name + " " + age + " пробежал " + this.run);
        } else {
            System.out.print(name + " " + age + " не может столько пробежать " + this.run);
        }
    }

    public void swim() {
        if (this.swimming <= 20) {
            System.out.println(" и проплыл " + this.swimming);
        } else {
            System.out.println(", но не может проплыть " + this.swimming);
        }
    }
}
