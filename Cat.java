package ru.geekbrains.java.javaone.homework.LessonSix;

//Создаем дочерний класс для кошек
public class Cat extends Animal{

    //Передаем в каждый экземпляр кошки строковый параметр name для дифферинциации
    public Cat(String name) {
        super(name);

        //Генерируем случайные значения для каждого из ограничительных параметров
        //Домашние коты не любят бегать более чем на 100 метров, но возьмем в расчет также не обленившихся
        this.maxRun = random.nextInt(150);

        //Задаем максимальный диапазон значений максимального прыжка. Здесь нужен double
        this.maxJump = Math.random() * 2;

        //0 потому что коты плавать не умеют.
        this.maxSwim = 0;


    }
}