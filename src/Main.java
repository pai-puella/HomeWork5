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
    }

}
