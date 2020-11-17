package ru.geekbrains.java.javaone.homework.LessonSix;

public class AnimalCompetition {
    public static void main(String[] args) {
        //На первый день создаем котов
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Йоша");

        //На второй день создаем собак
        Dog dog1 = new Dog("Эйс");
        Dog dog2 = new Dog("Тузик");

        //На шестой день заставляем их заниматься спортом
        cat1.run(70);
        cat1.jump(0.7);
        cat1.swim(10);
        System.out.println(); //Выведем пустую строку для индента

        cat2.run(200);
        cat2.jump(1.1);
        cat2.swim(10);
        System.out.println(); //Выведем пустую строку для индента

        dog1.run(700);
        dog1.jump(1);
        dog1.swim(10);
        System.out.println(); //Выведем пустую строку для индента

        dog2.run(500);
        dog2.jump(0.7);
        dog2.swim(70);
    }
}