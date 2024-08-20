public class Main {
    public static void main(String[] args) {
        System.out.println("Hello there!");

        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2013;
        int OS = 0;
        if (OS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (OS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");
        int year = 2021;
        if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100100 > 0) || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            int day = 1;
            System.out.println("Потребуется дней:" + day);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            int day = 2;
            System.out.println("Потребуется дней:" + day);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            int day = 3;
            System.out.println("Потребуется дней:" + day);
        } else {
            System.out.println("доставки нет");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 3, 4, 5:
                System.out.println(monthNumber + " месяц принадлежит к весне");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + " месяц принадлежит к лету");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + " месяц принадлежит к осени");
                break;
            case 12, 1, 2:
                System.out.println(monthNumber + " месяц принадлежит к зиме");
                break;
        }
    }
}

