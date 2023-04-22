public class Main {
    public static void main(String[] args) {
        task1Part1();
        task2Part1();
        task3Part1();
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
       System.out.println("Данные ФИО сотрудника для заполнения отчета — " +fullName.toUpperCase());
    }
    public static void task3Part1() {
        System.out.println("Задача 3 Чачть 1");
        //Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».
        //В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
        //Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
        //phone = phone.replace("+", "");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}