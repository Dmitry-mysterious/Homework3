void main() {
    // Задача 1
    System.out.println("--|| Задача 1 ||--");

    int intNum = 10000;
    byte byteNum = 127;
    short shortNum = 32000;
    long longNum = 100000;
    float floatNum = 32.454f;
    double doubleNum = 32.443223449;

    System.out.println("Значение переменной intNum с типом int равно " + intNum);
    System.out.println("Значение переменной byteNum с типом byte равно " + byteNum);
    System.out.println("Значение переменной shortNum с типом short равно " + shortNum);
    System.out.println("Значение переменной longNum с типом long равно " + longNum);
    System.out.println("Значение переменной floatNum с типом float равно " + floatNum);
    System.out.println("Значение переменной doubleNum с типом double равно " + doubleNum);

    System.out.println();


    // Задача 2
    float flNum = 27.12f;
    long lnNum = 987678965549L;
    float flNum2 = 2.786f;
    short shNum = 569;
    short shNum2 = -159;
    short shNum3 = 27897;
    byte btNum = 67;


    // Задача 3
    System.out.println("--|| Задача 3 ||--");

    byte ludmilaPavlovna = 23;
    byte annaSergeevna = 27;
    byte ekaterinaAndreevna = 30;

    short countPapers = 480;
    short countStudent = (short) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);

    short result = (short) (countPapers / countStudent);

    System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

    System.out.println();


    // Задача 4
    System.out.println("--|| Задача 4 ||--");

    byte machinePerformance = 16;
    byte minutes = 2;

    byte machinePerformByMinute = (byte) (machinePerformance / minutes);

    // производительность за 20 минут
    short machinePerformBy20Minutes = (short) (machinePerformByMinute * 20);

    System.out.println("За 20 минут машина произвела " + machinePerformBy20Minutes + " штук бутылок");

    // производительность за сутки
    short machinePerformByHour = (short) (machinePerformBy20Minutes * 3);
    short machinePerformByDay = (short) (machinePerformByHour * 24);

    System.out.println("За сутки машина произвела " + machinePerformByDay + " штук бутылок");

    // производительность за 3 дня
    int machinePerformBy3Days = machinePerformByDay * 3;

    System.out.println("За 3 дня машина произвела " + machinePerformBy3Days + " штук бутылок");

    // производительность за месяц (допустим в месяце 30 дней)
    int machinePerformBy30Days = machinePerformBy3Days * 10;

    System.out.println("За месяц машина произвела " + machinePerformBy30Days + " штук бутылок");

    System.out.println();


    // Задача 5
    System.out.println("--|| Задача 5 ||--");

    byte countPaint = 120;

    // На один класс
    byte whiteColor = 2;
    byte brownColor = 4;

    byte oneClassPaint = (byte) (whiteColor + brownColor);

    // Количество классов
    byte countClass = (byte) (countPaint / oneClassPaint);

    // Всего банок каждой краски
    byte totalWhiteColor = (byte) (whiteColor * countClass);
    byte totalBrownColor = (byte) (brownColor * countClass);

    System.out.println("В школе, где " + countClass + " классов, нужно "
            + totalWhiteColor + " банок белой краски и "
            + totalBrownColor + " банок коричневой краски");

    System.out.println();


    // Задача 6
    System.out.println("--|| Задача 6 ||--");

    // Количество грамм 5 бананов (80гр. 1 банан)
    short banana = 5 * 80;

    // Количество грамм 200 мл молока (105гр. 100мл молока)
    short milk = 2 * 105;

    // Количество грамм 2-х брикетов мороженного (100гр. 1 брикет)
    short iceCream = 2 * 100;

    // Количество грамм 4-х яиц (70гр. 1 яйцо)
    short eggs = 4 * 70;

    // Количество граммов завтрака
    short countGrams = (short) (banana + milk + iceCream + eggs);
    System.out.println("Количество грамм завтрака: " + countGrams);

    //Количество кг. завтрака
    float countKg = (float) countGrams / 1000;
    System.out.println("Количество килограмм завтрака: " + countKg);

    System.out.println();


    // Задача 7
    System.out.println("--|| Задача 7 ||--");

    // Цель похудения - 7кг. в граммах
    short target = 7 * 1000;

    byte res1 = (byte) (target / 250);
    System.out.println("Если спортсмен будет терять каждый день по 250 грамм, ему потребуется "
            + res1 + " дней");

    byte res2 = (byte) (target / 500);
    System.out.println("Если спортсмен будет терять каждый день по 500 грамм, ему потребуется "
            + res2 + " дней");

    byte averageRes = (byte) ((res1 + res2) / 2);
    System.out.println("Дней в среднем, чтобы добиться результата: "
            + averageRes + " дней");

    System.out.println();


    // Задача 8
    System.out.println("--|| Задача 8 ||--");

    // Начальный доход
    int amountMoneyMasha = 67760;
    int amountMoneyDenis = 83690;
    int amountMoneyKris = 76230;

    // 10% от дохода
    int PercentMasha = amountMoneyMasha * 10 / 100;
    int PercentDenis = amountMoneyDenis * 10 / 100;
    int PercentKris = amountMoneyKris * 10 / 100;

    // ЗП каждого с повышением на 10%
    int moneyMashaWithPer = amountMoneyMasha + PercentMasha;
    int moneyDenisWithPer = amountMoneyDenis + PercentDenis;
    int moneyKrisWithPer = amountMoneyKris + PercentKris;

    // Годовой доход до повышения
    int moneyMashaForYear = amountMoneyMasha * 12;
    int moneyDenisForYear = amountMoneyDenis * 12;
    int moneyKrisForYear = amountMoneyKris * 12;

    // Годовой доход после повышения
    int moneyMashaForYearWithPer = moneyMashaWithPer * 12;
    int moneyDenisForYearWithPer = moneyDenisWithPer * 12;
    int moneyKrisForYearWithPer = moneyKrisWithPer * 12;

    // Разница годовых доходов до и после повышения
    int diffIncomeMasha = moneyMashaForYearWithPer - moneyMashaForYear;
    int diffIncomeDenis = moneyDenisForYearWithPer - moneyDenisForYear;
    int diffIncomeKris = moneyKrisForYearWithPer - moneyKrisForYear;

    System.out.println("Маша теперь получает " + moneyMashaWithPer
            + " рублей. Годовой доход вырос на " + diffIncomeMasha + " рублей");

    System.out.println("Денис теперь получает " + moneyDenisWithPer
            + " рублей. Годовой доход вырос на " + diffIncomeDenis + " рублей");

    System.out.println("Кристина теперь получает " + moneyKrisWithPer
            + " рублей. Годовой доход вырос на " + diffIncomeKris + " рублей");
}
