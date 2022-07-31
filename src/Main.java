public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    private static void task1() {
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");
    }

    private static void task2() {
        byte clientOS = 1;
        int year = 2014;
        if (clientOS == 0 && year >= 2015 && year < 2023) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year >= 2015 && year < 2023) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    private static void task3() {
        int year = 2021;
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }
    }

    private static void task4() {
        int deliveryDistance = 95;
        byte daysRequired = 2;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + --daysRequired);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + daysRequired);
        } else if (deliveryDistance > 60) {
            System.out.println("Потребуется дней: " + ++daysRequired);
        }
    }

    private static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону Осень");
                break;
            default:
                System.out.println("Месяца с номером " + monthNumber + " не существует");
        }
    }

    private static void task6() {
        byte age = 19;
        int salary = 58000;
        byte ageLimit = 23;
        int salaryLimitLow = 50000;
        int salaryLimitHigh = 80000;
        if (age >= ageLimit && salary >= salaryLimitLow) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (3 * salary * 1.2) + " рублей.");
        } else if (age >= ageLimit && salary >= salaryLimitHigh) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (3 * salary * 1.5) + " рублей.");
        } else if (age < ageLimit && salary >= salaryLimitLow) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (2 * salary * 1.2) + "рублей.");
        } else if (age < ageLimit && salary >= salaryLimitHigh) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (2 * salary * 1.5) + "рублей.");
        } else if (age < 18) {
            System.out.println("Извините, мы не готовы выдать вам кредитную карту");
        }
    }

    private static void task7() {
        byte age = 27;
        int salary = 20000;
        int wantedSum = 330000;
        byte baseTerm = 12;

        double maxMonthlyPay = 0.5 * salary;
        double averageMonthPay = Math.ceil(wantedSum * 1.1 / baseTerm);

        if (age < 23 && salary >= 80000 && (averageMonthPay * 1.01 * (1 - 0.007)) <= maxMonthlyPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPay + " рублей. Платеж по кредиту " + Math.ceil(averageMonthPay * 1.01 * (1 - 0.007)) + " рублей. Одобрено».");
        } else if (age < 23 && salary < 80000 && (averageMonthPay * 1.01) <= maxMonthlyPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPay + " рублей. Платеж по кредиту " + Math.ceil(averageMonthPay * 1.01) + " рублей. Одобрено».");
        } else if (age < 30 && salary >= 80000 && (averageMonthPay * 1.005 * (1 - 0.007)) <= maxMonthlyPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPay + " рублей. Платеж по кредиту " + Math.ceil(averageMonthPay * 1.005 * (1 - 0.007)) + " рублей. Одобрено».");
        } else if (age < 30 && salary < 80000 && (averageMonthPay * 1.005) <= maxMonthlyPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPay + " рублей. Платеж по кредиту " + Math.ceil(averageMonthPay * 1.005) + " рублей. Одобрено».");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPay + " рублей. Платеж по кредиту " + averageMonthPay + " рублей. Неодобрено.");
        }

    }
}