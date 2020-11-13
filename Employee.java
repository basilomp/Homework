package src.main.java.ru.geekbrains.java.javaone.homework.LessonFive;

import java.util.Scanner;

//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
public class Employee {
    //Вводим переменные
    public static Object getAge; //Геттер для возвраста
    public String fullName; //ФИО
    public String jobTitle; //Должность
    public String personality; //Характер
    public String profile; //Био
    public String email; //Email
    public String phoneNumber; //Тел. номер
    public String address; //Адрес
    public String passportNumber; //Номер паспорта
    public String maritalStatus; //Сем. положение
    int salary; //Зарплата
    int age; //Возвраст




    //Создаем конструктор класс
    public Employee(String fullName, String jobTitle, String personality, String profile, String maritalStatus, String email, String phoneNumber,
                    String address,
                    String passportNumber, int salary, int age) { //обозначаем параметры на вход

        //Инициализируем входные параметры
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.profile = profile;
        this.personality = personality;
        this.maritalStatus = maritalStatus;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.passportNumber = passportNumber;
        this.salary = salary;
        this.age = age;
    }

    //Создаем геттер-конструктор для возврата возраста в соседний класс
    public int getAge() {

        return age;
    }

    //Создаем конструктор для вывода информации о сотрудниках в консоль при запросе админом
    public void revealAdmin() {
        System.out.println("Имя:\t\t" + fullName + "\n" + "Должность:\t" + jobTitle + "\n" + "Возраст:\t" + age + "\n" + "Биографиия\t" + profile +
                "\n" +
                "Характер:\t" + personality +
                "\n" + "Сем. положение:\t" + maritalStatus + "\n" + "Email:\t\t" + email + "\n" + "Тел. номер:\t" + phoneNumber + "\n" +
                "Адрес:\t\t" + address + "\n" + "Паспорт:\t" + passportNumber + "\n" + "Зарплата:\t" + salary + "\n");
    }

    public void revealUser() {
        //Создаем конструктор для вывода информации о сотруднике в кансоль при запросе обычным пользователем.
        //Исключаем параметры с чувствительной, коммерческой и конфиденциальной информацией. Оставляем базовую информацию для коммуникации.
        System.out.println("Имя:\t\t" + fullName + "\n" + "Должность:\t" + jobTitle + "\n" + "Email:\t\t" + email + "\n");
    }




}
