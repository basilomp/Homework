package ru.geekbrains.java.javaone.homework.LessonSix;

import java.util.Random;

public class Animal {
    //Декларируем переменные, которые передадутся в дочерние классы

    //Имя
    protected String name;
    //Максимальная дистанция бега
    protected int maxRun;
    //Максимальная дистанция плавания
    protected int maxSwim;
    //Максимальная высота прыжка
    protected double maxJump;
    //Инициализируем рэндом, чтобы для каждого из животных случайно генерировать предельные значения
    public Random random = new Random();

    //Создаем конструктор для животных
    public Animal(String name){
        this.name = name; // при создании объекта нужно ввести имя
    }

    //Создаем наследуемый метод для проверки бега. Передаем в него параметр, означающий длину.
    public void run(int length) { // выводит инфо об объекте относительно действия
        if (this.maxRun >= length) System.out.println( this.name + " пробежал(а) " + length + " м.");
        else System.out.println(this.name + " сошел с дистанции.");
    }

    //Создаем наследуемый метод для проверки плавания. Передаем в него параметр, означающий длину.
    public void swim(int length) {// выводит инфо об объекте относительно действия
        //Сначало проверяем, не равно ли предельное значение 0 (для кошек). Кошки не умеют/не любят плавать.
        if (this.maxSwim == 0)
            System.out.println(this.name + " не умеет плавать");
            //Далее проверяем отношение меньше-больше
        else if (this.maxSwim >= length)
            System.out.println(this.name + " проплыл(а) " + length + " м.");
        else
            System.out.println(this.name + " был(а) снят(а) с плавательной дородки.");
    }

    //Создаем наследуемый метод для проверки прыжка. Передаем в него параметр, означающий высоту.
    public void jump(double height) {// выводит инфо об объекте относительно действия
        if (this.maxJump >= height)
            System.out.println(this.name + " прыгнул(а) на высоту " + height + " м.");
        else System.out.println(this.name + " не смог(ла) прыгнуть и упал(а) навзничь.");
    }

}

