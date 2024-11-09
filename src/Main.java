import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import Tasks.Task4;
import Polyclinic.Polyclinic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Education Java Project ");
        System.out.println("------------------------\n");

        var doWork = true;
        var input = new Scanner(System.in);

        while (doWork) {
            System.out.println(" 1 - Тестовые задачи\n 2 - Задачи Polyclinic\n 0 - Выход");
            var selectedItem = input.nextInt();
            switch (selectedItem) {
                case 1: {
                    MenuTasks();
                    System.out.println("------------------------\n");
                    break;
                }
                case 2: {
                    MenuPolyclinic();
                    System.out.println("------------------------\n");
                    break;
                }
                case 0: {
                    doWork = false;
                    break;
                }
                default: {
                    System.out.println("ERROR: Не известный элемент меню.");
                }
            }
        }
    }

    private static void MenuTasks() {
        System.out.println(" Тестовые задачи ");
        System.out.println("-----------------\n");

        var doWork = true;
        var input = new Scanner(System.in);

        while (doWork) {
            System.out.println("""
                     1 - Задание 1 (Удвоенный куб числа)
                     2 - Задание 2 (Тангенс максимального числа)
                     3 - Задание 3 (Одномерный массив и единственный нулевой элемент)
                     4 - Задание 4 (Cреднее арифметическое положительных элементов)
                     0 - Выход""");
            var selectedItem = input.nextInt();
            switch (selectedItem) {
                case 1: {
                    var task = new Task1();
                    task.DoTask(new String[]{"100", "25"});
                    break;
                }
                case 2: {
                    var task = new Task2();
                    task.DoTask(new String[]{});
                    break;
                }
                case 3: {
                    var task = new Task3();
                    task.DoTask(new String[]{});
                    break;
                }
                case 4: {
                    var task = new Task4();
                    task.DoTask(new String[]{});
                    break;
                }
                case 0: {
                    doWork = false;
                    break;
                }
                default: {
                    System.out.println("ERROR: Не известный элемент меню.");
                }
            }
        }
    }

    private static void MenuPolyclinic() {
        System.out.println(" Тестовые задачи ");
        System.out.println("-----------------\n");

        var doWork = true;
        var input = new Scanner(System.in);

        while (doWork) {
            System.out.println("""
                     1 - Задание 5 (Описать свойства, конструктор, перекрыть метод toString())
                     2 - Задание 6 (Базовая коллекция)
                     0 - Выход""");
            var selectedItem = input.nextInt();
            switch (selectedItem) {
                case 1: {
                    var testData = new Polyclinic("Клиника №1", "Улица 1, Дом 1",
                            "Иванов", 1001, LocalDate.now());

                    testData.setDoctorLastName("Петров");
                    testData.setDoctorPosition("Главврач");
                    testData.setDiagnosis("ОРВ");

                    System.out.println(testData.toString());

                    break;
                }
                case 2: {
                    Task6_BasicCollection();
                    break;
                }

                case 0: {
                    doWork = false;
                    break;
                }
                default: {
                    System.out.println("ERROR: Не известный элемент меню.");
                }
            }
        }
    }

    // Задание 6
    // Выполнить преобразование класса в коллекцию. Создать пользовательское меню.
    // Организовать добавление объектов в коллекцию и вывод отсортированных объектов коллекции
    // на экран с помощью меню.
    private static void Task6_BasicCollection() {
        System.out.println(" Коллекция Polyclinic ");
        System.out.println("-----------------\n");

        var collection = new ArrayList<Polyclinic>();
        var random = new Random();

        var doWork = true;
        var input = new Scanner(System.in);

        while (doWork) {
            System.out.println("""
                     1 - Добавить элемент в коллекцию
                     2 - Вывести коллекцию отсортированную по имени пациента
                     3 - Вывести коллекцию отсортированную по дате посещения
                     0 - Выход""");
            var selectedItem = input.nextInt();
            input.nextLine();
            switch (selectedItem) {
                case 1: {
                    System.out.println(" Введите имя пациента: ");
                    var patientName = input.nextLine();

                    System.out.println(" Введите дату посещения: ");
                    var nextDate = input.nextLine();

                    var date = LocalDate.parse(nextDate);

                    var testData = new Polyclinic("Клиника №1", "Улица 1, Дом 1",
                            patientName, random.nextInt(10000), date);

                    testData.setDoctorLastName("Петров");
                    testData.setDoctorPosition("Главврач");
                    testData.setDiagnosis("ОРВ");

                    collection.add(testData);

                    System.out.println(testData.toSmallString());
                    break;
                }
                case 2: {
                    collection.sort((o1, o2) -> (o1.getPatientLastName().compareToIgnoreCase(o2.getPatientLastName())));

                    System.out.println("Коллекцию отсортированная по имени пациента:");
                    for (var item : collection) {
                        System.out.println(item.toSmallString());
                    }

                    break;
                }
                case 3: {
                    collection.sort((o1, o2) -> (o1.getAppointmentDate().compareTo(o2.getAppointmentDate())));

                    System.out.println("Коллекцию отсортированная по дате посещения:");
                    for (var item : collection) {
                        System.out.println(item.toSmallString());
                    }

                    break;
                }

                case 0: {
                    doWork = false;
                    break;
                }
                default: {
                    System.out.println("ERROR: Не известный элемент меню.");
                }
            }
        }
    }
}
