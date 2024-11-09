import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import Tasks.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Education Java Project ");
        System.out.println("------------------------\n");

        var doWork = true;
        var input = new Scanner(System.in);

        while (doWork) {
            System.out.println(" 1 - Тестовые задачи\n 2 - Задачи Polyclinic\n 3 - Выход");
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
                case 3: {
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
            System.out.println(" 1 - Задание 1 (Удвоенный куб числа)\n 2 - Задание 2 (Тангенс максимального числа)\n " +
                    "3 - Задание 3 (Одномерный массив и единственный нулевой элемент)\n " +
                    "4 - Задание 4 (Cреднее арифметическое положительных элементов)\n 5 - Выход");
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
                case 5: {
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

    }
}
