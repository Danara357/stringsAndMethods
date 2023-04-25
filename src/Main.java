package ru.skypro;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        task1Part1();
        task2Part1();
        task3Part1();
        task1Part2();
        checkYearLeap(2021);
        task2Part2();
        defineAppVersion(0, 2021);
        defineAppVersion(1, 2023);
        task3Part2();
        showCardDeliveryDays  (1000);
        showCardDeliveryDays  (10);

    }


    public static void task1Part1() {
        System.out.println("Задача 1 Чачть 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }

    public static void task2Part1() {
        System.out.println("Задача 2 Чачть 1");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3Part1() {
        System.out.println("Задача 3 Чачть 1");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    public static void task1Part2() {
        System.out.println("Задача 1 Чачть 2");
    }

    public static void checkYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год является високосным");
        } else {
            System.out.println(year + " - год не является високосным");
        }
    }

    public static void task2Part2() {
        System.out.println("Задача 2 Чачть 2");
    }

    public static void defineAppVersion(int mobileOS, int mobeleYear) {
        String mobileOSName;
        int currentYear = LocalDate.now().getYear();

        switch (mobileOS) {
            case 0:
                mobileOSName = "iOS";
                break;
            case 1:
                mobileOSName = "Android";
                break;
            default:
                mobileOSName = "неизвестная ОС";
        }
        if (mobeleYear != currentYear) {
            System.out.println("Для OC " + mobileOSName + " установите Light-версию.");
        }else {
            System.out.println("Для OC " + mobileOSName + " установите обычную версию.");
        }
    }


    public static void task3Part2() {
        System.out.println("Задача 3 Чачть 2");
    }
    public static void showCardDeliveryDays (int distance) {
        int deliveryDays = calcCardDeliveryDays(distance);

        if (deliveryDays > 0) {
            System.out.println("Потребуется дней для достаки " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static int calcCardDeliveryDays(int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance<=60) {
            deliveryDays = 2;
        } else if (distance<=100) {
            deliveryDays = 3;
        }else {
            deliveryDays = -1;
        }

        return deliveryDays;

        }
    }

