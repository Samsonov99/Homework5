import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите Вашу ОС (0 - IOS, 1 - Android): ");
        int clientOS = sc.nextInt();
        String message;
        switch (clientOS) {
            case 0:
                message = "iOS по ссылке";
                System.out.println("Установите версию приложения для " + message);
                break;
            case 1:
                message = "Android по ссылке";
                System.out.println("Установите версию приложения для " + message);
                break;
            default:
                System.out.println("Никто уже не пользуется Windows Phone");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите Вашу ОС (0 - IOS, 1 - Android): ");
        int clientOS = sc.nextInt();
        System.out.println("Укажите год выпуска Вашего телефона ");
        int clientDeviceYear = sc.nextInt();
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Некорректно введены данные");
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите интересующий Вас год: ");
        int year = sc.nextInt();
        if (year < 1584) {
            System.out.println("Начните с 1584 года, когда был введен високосный год");
        } else if ((year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние в километрах: ");
        int deliveryDistance = sc.nextInt();
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней для доставки: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней для доставки: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней для доставки: 3");
        } else {
            System.out.println("Не не не, в такую даль мы не поедем");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите номер месяца: ");
        int monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
