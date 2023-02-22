public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int targetSum = 2_459_000;
        int currentSum = 0;
        int incresePerMonth = 15_000;
        int currentMonth = 0;

        while (currentSum < targetSum) {
            currentSum += incresePerMonth;
            currentMonth++;
            System.out.println("Месяц " + currentMonth + ", сумма накоплений равна " + currentSum + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int people = 12_000_000;
        int death = 8;
        int born = 17;

        for (int i = 1; i <= 10; i++) {
            people = people + people/1000*born - people/1000*death;
            System.out.println("Год " + i + ", численность населения составляет " + people);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int deposit = 15_000;
        int target = 12_000_000;
        double percent = 0.07;
        int month = 0;

        while (deposit < target) {
            month ++;
            deposit *= (1 + percent);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int deposit = 15_000;
        int target = 12_000_000;
        double percent = 0.07;
        int month = 0;

        while (deposit < target) {
            month ++;
            deposit *= (1 + percent);

            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int deposit = 15_000;
        //int target = 12_000_000;
        double percent = 0.07;
        int month = 0;
        int limitMonthCount = 9 * 12;

        while (month < limitMonthCount) {
            month ++;
            deposit *= (1 + percent);

            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int firstReportDate = 3;

        for (int curDate = firstReportDate; curDate < 31; curDate ++) {
            if ((curDate - firstReportDate) % 7 == 0) {
                System.out.println("Сегодня пятница, " + curDate + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");

        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cycle = 79;
        int calculateYear = 0;

        while (calculateYear < endYear) {
            if (startYear < calculateYear) {
                System.out.println(calculateYear);
            }
            calculateYear += cycle;
        }
    }
}