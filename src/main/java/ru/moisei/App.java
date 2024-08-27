package ru.moisei;

public class App {
//      1. Создать классы Собака и Кот с наследованием от класса Животное.
//      2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
//            препятствия. Результатом выполнения действия будет печать в консоль. (Например,
//            dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//      3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
//          кот не умеет плавать, собака 10 м.).


    public static void main(String[] args) {
        Animal[] animal = {
                new Cat("Barsik"),
                new Cat("Мурзик"),
                new Dog("бобик"),
                new Dog("шарик"),

        };
        animal[0].run(100);
        animal[0].swim(0);
        System.out.println();
        animal[1].run(300);
        animal[1].swim(10);
        System.out.println();
        animal[2].run(100);
        animal[2].swim(10);
        System.out.println();
        animal[3].run(600);
        animal[3].swim(21);
        System.out.println();

    }
}

