package ru.geekbrains.java.javaone.homework.LessonSeven;

import java.util.Scanner;

public class Bowl {
    //Декларируем переменные миски
    private boolean empty = true; //Булевая переменная, отвечающая за полноту миски
    //Целочисленная переменная, обозначающая максимальную вместимость миски
    private int fullBowl;
    //Целочисленная переменная, обозначающая реальное количество еды в миске
    private int food;

    //Собираем миску
    public Bowl(int food, int fullBowl) {
        this.food = food;
        this.fullBowl = fullBowl;


    }
    //Метод для вывода информации о кол-ве еды в миске
    public void info() {
        System.out.println("Еды в миске: " + food + " грамм.");
    }

    //Геттер для еды
    public int getFood() {
        return food;
    }

    //Сеттер для еды (наполняем с его помощью миску)
    public int setFood(int food, Bowl bowl) {
        this.food = food;
        //Прибавляем к текущему кол-ву корма разницу между ним и максимальной вместимостью миски
        this.food = bowl.getFood() + (fullBowl - bowl.getFood());
        return this.food;
    }

    //Метод для уменьшения еды при кормлении кота
    public void decreaseFood (int hunger) {
        //Если еды в миске больше голода зверя, уменьшаем
        if (food - hunger >= 0)
        this.food -= hunger;
        else System.out.println("В тарелке не хватает еды.");
    }


//Сеттер и геттер для пустоты миски (реализовал функцию через другие методы: сытость и добавление еды)
//    public boolean setEmpty(boolean empty, Bowl bowl) {
//        this.empty = empty;
//        if(bowl.getFood() >= 0)
//            return false;
//        else return true;
//
//    }
//
//    public boolean isEmpty() {
//        return empty;
//    }


    //Метод для проверки возможности добавления корма и самого добавления
    public boolean increaseFood(Cat[] catArray, Bowl bowl) {
        //Вводим булевую переменную
        boolean answer = true;
        //Если еды не хватает даже котику с самым низким показателем голода, предлагаем наполнить миску
        if((bowl.getFood() - bowl.leastHungry(catArray)) <= 0) {
            if (bowl.choice()) {
            bowl.setFood(food, bowl);
            System.out.println("Вы наполнили миску.");
            bowl.info();
            System.out.println();
            return answer;
            }
            else System.out.println("Вы обрекли себя на мучительную смерть...");
            answer = false;
        } return answer;
    }

    //Метод для определения самого голодного котика
    public int leastHungry (Cat[] catArray) {
        int leastHungry = catArray[0].getHunger();
        for (int i = 0; i < catArray.length; i++) {
            if (catArray[i].getHunger() < leastHungry) {
                leastHungry = catArray[i].getHunger();
            }

        } return leastHungry;

    }
    //Метод для чтения пользовательского ввода - решения о наполнении миски
    public boolean choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Еды в миске не хватит котикам!");
        System.out.println("Добавить корма?");
        System.out.println("1 - да.\n0 - нет, но коты съедят вас.");
        int answer = scanner.nextInt();
        if (answer == 1) {
            return true;
        } else
        return false;
    }
}
