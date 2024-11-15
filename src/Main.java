import Polyclinic.MedicalServiceSortBy;
import Polyclinic.Vaccination;
import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import Tasks.Task4;
import Polyclinic.MedicalService;
import Polyclinic.MedicalServiceStorage;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static MedicalServiceStorage msStorage;

    public static void main(String[] args) {
        msStorage = new MedicalServiceStorage();

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
        System.out.println(" Задачи MedicalService / Polyclinic ");
        System.out.println("------------------------------------\n");

        var doWork = true;
        var input = new Scanner(System.in);
        var random = new Random();

        while (doWork) {
            System.out.println("""
                     1 - Добавить элемент в хранилище
                     2 - Вывести все данные отсортированные по имени пациента
                     3 - Вывести все данные отсортированные по дате посещения
                     4 - Вывести все данные отсортированные по названию клиники
                     10 - Загрузить хранилище из файла
                     20 - Сохранить хранилище в файл
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

                    var patiendID = random.nextInt(10000);

                    var testData = new MedicalService("Клиника №1", "Улица 1, Дом 1",
                            patientName, patiendID, date);

                    testData.setDoctorLastName("Петров");
                    testData.setDoctorPosition("Главврач");
                    testData.setDiagnosis("ОРВ");

                    msStorage.add(testData);
                    System.out.println(testData);

                    var vaccinationItem = new Vaccination("Клиника №1", "Улица 1, Дом 1",
                            patientName, patiendID, date.plusDays(2));

                    vaccinationItem.setDoctorLastName("Петров");
                    vaccinationItem.setDoctorPosition("Главврач");
                    vaccinationItem.setDiagnosis("Вакцинация");
                    vaccinationItem.setVaccineName("V-1");
                    vaccinationItem.setValidity(5);

                    msStorage.add(vaccinationItem);
                    System.out.println(vaccinationItem);

                    break;
                }
                case 2: {
                    System.out.println("Все данные отсортированные по имени пациента:");
                    msStorage.sort(MedicalServiceSortBy.PatientName);
                    msStorage.print();
                    break;
                }
                case 3: {
                    System.out.println("Все данные отсортированные по дате посещения:");
                    msStorage.sort(MedicalServiceSortBy.AppointmentDate);
                    msStorage.print();
                    break;
                }
                case 4: {
                    System.out.println("Все данные отсортированные по названию клиники:");
                    msStorage.sort(MedicalServiceSortBy.ClinicName);
                    msStorage.print();
                    break;
                }
                case 10: {
                    try {
                        msStorage.LoadFromFile();
                        System.out.println("Загружено из файла");
                    }
                    catch(Exception e) {
                        System.out.println("ERROR: Не удалось загрузить файл. " + e);
                    }
                    break;
                }
                case 20: {
                    try {
                        msStorage.SaveToFile();
                        System.out.println("Сохранено в файл");
                    }
                    catch(Exception e) {
                        System.out.println("ERROR: Не удалось сохранить файл. " + e);
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
