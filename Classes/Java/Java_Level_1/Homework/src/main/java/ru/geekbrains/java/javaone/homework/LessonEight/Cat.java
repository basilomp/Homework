package ru.geekbrains.java.javaone.homework.LessonEight;

public class Cat {
    //Декларируем переменные, которые будет использовать объект класса "Cat"
    private String name; //Имя зверя
    private int hunger; //Целочисленный голод зверя
    private boolean full; //Булевая переменная, отвечающая за сытость

    //Собираем классического кота
    public Cat(String name, int hunger, boolean full) {
        this.name = name;
        this.hunger = hunger;
        //По дефолту котик голоден
        this.full = false;
    }
    //Создаем метод кормежки
    public void feed(Bowl bowl) {
        //Вывод информации о коте в консоль


        //Если еды в миске больше голода - уменьшаем еду в миске
        if (isCatFull(bowl)) {
            bowl.decreaseFood(this.hunger);
        }
        //Если еды мало, говорим, что кот не наелся
        else {
            this.full = false;
        }
    }
    //Конструктор для получения кошачьего голода
    public int getHunger() {
        return hunger;
    }
    //метод для определения возможного насыщения зверя
    public boolean isCatFull(Bowl bowl) {
        //Если еды в миске больше, котик может наесться
        if (bowl.getFood() >= this.hunger) {
            this.full = true;
            System.out.println("Котик " + this.name + " наелся.");
        }   else {
        this.full = false;
            System.out.println("Котик " + this.name + " смотрит на вас голодными глазами.");}
        return this.full;


}

    public String getName() {
        return this.name;
    }
}
