package src.main.java.ru.geekbrains.java.javaone.homework.LessonFive;

import java.util.Scanner;

public class EmployeeInfoApp {
    //Вводим сканнер для проверки пароля администратора
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Создаем массив из объектов соседнего класс и задаем для них параметры
        Employee[] employeeList = new Employee[5];

        //Сотрудник 1.
        employeeList[0] = new Employee("Билли Бонс",
                "Капитан",
                "Скверный",
                "Много пьёт и всегда простужен.",
                "Не женат", "bons@happyinc.com",
                "55-53-535",
                "Treasure Island, Ill-Tempered Street, 7",
                "25 78 111315",
                14000,
                51);

        //Сотрудник 2.
        employeeList[1] = new Employee("Бен Ганн",
                "Пират (бывший)",
                "Мягкий",
                "В детстве был благовоспитанным мальчиком, но начал играть в орлянку, связался с пиратами и покатился.",
                "Не женат",
                "marooned@expirate.com",
                "505-503-4455",
                "Treasure Island, Soft-Tempered Street, 0",
                "Нет", 0, 45);

        //Сотрудник 3.
        employeeList[2] = new Employee("Джон 'Одноногий' Сильвер",
                "Капитан пиратов",
                "Скрытный",
                "Самый страшный пират, но притворяется добрым, " +
                "что, впрочем, ему удаётся.",
                "Не женат",
                "alphapirate@skullandbones.org",
                "112-105-114-97-116-101",
                "Treasure Island, Clandestine Street, 0",
                "11 11 10101108101103",
                9999999,
                61);

        //Сотрудник 4.
        employeeList[3] = new Employee("Капитан Смолетт",
                "Моряк и солдат",
                "Прескверный",
                "Любит говорить всем правду в глаза, отчего и страдает.",
                "Не женат.",
                "smmollett@dutyfirst.io",
                "(646) 926-6614",
                "Treasure Island, Louse Ave., 13",
                "11 51 09109111108",
                25000,
                58);

        //Сотрудник 5.
        employeeList[4] = new Employee("Джим Хокинс",
                "Юнга",
                "Очень мягкий",
                "Слушает маму и каждое утро делает зарядку.",
                "Не женат.",
                "seenoevil@karateenjoyer.ucoz.net",
                "911-112-11-22",
                "Treasure Island, Gutless Ave., 13",
                "10 31 11111100",
                300,
                15);


        //Запрашиваем пароль для доступа к данным -- qwerty1234
        System.out.println("Введите пароль администратора, который вы составили с учётом продвинутых гайдлайнов безопасности нашей компании?");

        //1. Пароль правильный -- выводим полный список данных
        if (scanner.nextLine().equals("qwerty1234")) {
        //Создаем массив для возврата информации о сотрудниках старше 40 лет
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i].getAge() > 40) {
                System.out.println("Сотрудник " + (i + 1) + ". ");
                employeeList[i].revealAdmin();
            }
        }
        //Пароль неправильный -- выводим ограниченный список
        } else {
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i].getAge() > 40) {
            System.out.println("Сотрудник " + (i + 1) + ". ");
            employeeList[i].revealUser();
            }
        }
        }
    }
}
