package ru.geekbrains.java.javaone.homework.LessonSeven;

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
        System.out.println(("Кот " + name + " пытается заполнить пустоту внутри себя и пробует съесть "
                            + this.hunger + " г. пищи."));

        //Если еды в миске больше голода - уменьшаем еду в миске
        if (isCatFull(bowl)) {
            bowl.decreaseFood(this.hunger);
            System.out.println("full: " + this.full);
        }
        //Если еды мало, говорим, что кот не наелся
        else {
            this.full = false;
            System.out.println("full: " + this.full);
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
}
