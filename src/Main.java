import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 1999;
        showIsYearLeap(year);
        System.out.println("Task 2");
        int deviceYear = 2025;
        byte clientOS = 0;
        checkUpdates(clientOS, deviceYear);
        System.out.println("Task 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней для доставки " + countOfDeliveryDays(deliveryDistance));
    }

    public static void showIsYearLeap(int year) {
        if (year >= 1584) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("В григорианском календаре ещё не ввели високосность.");
        }
    }

    public static void checkUpdates(byte OS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (OS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OS == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка версии клиента!");
        }
    }

    public static int countOfDeliveryDays(int distance) {

        if (distance > 100) {
            System.out.println("Нет доставки");
            return 0;
        }
        int deliveryTime = 1;
        if (distance > 20) {
            deliveryTime += 1;
            //  System.out.println("Доставка займет " + deliveryTime + " суток");
        }
        if (distance > 60) {
            deliveryTime += 1;
            // System.out.println("Доставка займет " + (deliveryTime+1) + " суток");
        }
        return deliveryTime;
    }
}