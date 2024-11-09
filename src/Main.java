import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import Tasks.Task4;
import Polyclinic.Polyclinic;

import java.time.LocalDate;
import java.util.Scanner;

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
