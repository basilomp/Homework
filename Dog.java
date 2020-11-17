package ru.geekbrains.java.javaone.homework.LessonSix;

public class Dog extends Animal{
    //Передаем в каждый экземпляр кошки строковый параметр name для дифферинциации
    public Dog(String name) {
        super(name);

        //Генерируем случайные значения для каждого из ограничительных параметров
        //Псы могу пробегать до 8 км, но возьмем 1000, чтобы котам не было обидно.
        this.maxRun = random.nextInt(1000);

        //Максимальная высота прыжка. Псы менее прыгучие. За их чувства не беспокоимся. Здесь нужен double
        this.maxJump = Math.random() * 1.5;

        //Задаем плавательный максимум
        this.maxSwim = random.nextInt(200);

    }
}