import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 0, если у вас IPhone, или 1, если Android: ");
        int clientOS = scanner.nextInt();

        switch (clientOS) {
            case 0 -> System.out.println("Установите версию приложения для iOS по ссылке");
            case 1 -> System.out.println("Установите версию приложения для Android по ссылке");
            default -> System.out.println("Некорректное значение переменной clientOS");
        }

        System.out.println();
        System.out.println("Задача 2");
        System.out.print("Введите год создания телефона: ");
        int clientDeviceYear = scanner.nextInt();

        switch (clientOS) {
            case 0 -> {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            }
            case 1 -> {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
            default -> System.out.println("Некорректное значение переменной clientOS");
        }

        System.out.println();
        System.out.println("Задача 3");
        int year = 2022;

        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = -1; // Если расстояние больше 100 км, доставки нет
        }

        if (deliveryTime != -1) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println();
        System.out.println("Задача 5");
        int monthNumber = 12;

        // Проверяем, что номер месяца не больше 12
        if (monthNumber > 12) {
            System.out.println("Некорректный номер месяца");
            return;
        }

        String season;

        // Определяем сезон по номеру месяца
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Некорректный номер месяца";
                break;
        }

        System.out.println("Месяц " + monthNumber + " принадлежит к сезону " + season);
    }
}
