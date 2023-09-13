// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    //task 1
      int cat = 34444341;
      byte dog = 126;
      short cow = 32000;
      long rabbit = 199999999123129l;
      float lion = 43.51234f;
      double rat = 4.4412312323;
        System.out.println("Значение переменной cat с типом int равно " + cat);
        System.out.println("Значение переменной dog с типом byte равно " + dog);
        System.out.println("Значение переменной cow с типом short равно " + cow);
        System.out.println("Значение переменной rabbit с типом long равно " + rabbit);
        System.out.println("Значение переменной lion с типом float равно " + lion);
        System.out.println("Значение переменной rat с типом rat равно " + rat);

    //task 2
     float variableOne = 27.12f;
     long variableTwo = 987678965549l;
     float variableThree = 2.768f;
     int variableFour = 569;
     int variableFive = -159;
     int  variableSix = 67;
    /*
     Вывод переменных в задании не требуется, добавлю в виде комментария.
      System.out.println("Значение первой переменной " + variableOne);
      System.out.println("Значение второй переменной " + variableTwo);
      System.out.println("Значение третьей переменной " + variableThree);
      System.out.println("Значение четвертой переменной " + variableFour);
      System.out.println("Значение пятой переменной " + variableFive);
      System.out.println("Значение шестой переменной " + variableSix);
    */

    //task 3
      byte classOne = 23;
      byte classTwo = 27;
      byte classThree = 30;
      int totalPapers = 480;
      int totalStudents = classOne+classTwo+classThree;
      float paperForStudent = totalPapers / totalStudents; //если предварительно не известен рез-т деления, лучше использовать float/double но для задачи подойдет int
       System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

    //task 4
      byte minutesInHour = 60;
      byte hoursInDay = 24;
      byte bottlesPerMin = 8;
      int bottlesPerThirdOffHour = 20*bottlesPerMin;
      int minutesInDay = hoursInDay*minutesInHour;
      int bottlesPerDay = minutesInDay * bottlesPerMin;
      int bottlesPerTheeDays = 3*bottlesPerDay;
      int bottlesPerMonth = 31*bottlesPerDay; //предположим, что в месяце 31 день
       System.out.println("За 20 минут машина произвела " + bottlesPerThirdOffHour+ " бутылок");
       System.out.println("За сутки машина произвела " + bottlesPerDay+ " бутылок");
       System.out.println("За 3 дня машина произвела " + bottlesPerTheeDays+ " бутылок");
       System.out.println("За месяц (31день) машина произвела " + bottlesPerMonth+ " бутылок");

    //task 5
      byte totalTins = 120;
      byte whitePerClass = 2;
      byte brownPerClass = 4;
      int totalTinsPerClass = whitePerClass + brownPerClass;
      int totalClasses = totalTins / totalTinsPerClass;
      int totalWhite = totalClasses * whitePerClass;
      int totalBrown = totalClasses * brownPerClass;
       System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белок краски и " + totalBrown + " банок коричневой краски");

    //task 6
      byte amountBanana = 5;
      int amountMilk = 200;
      int amountIceCream = 2;
      int amountEggs = 4;
      int totalBananaWeight = amountBanana*80;
      int totalMilkWeight = (amountMilk / 100) * 105;
      int totalIceCreamWeight = amountIceCream * 100;
      int totalEggsWeight = amountEggs * 70;
      float totalWeightOfBreakfastGrams = totalEggsWeight + totalBananaWeight + totalMilkWeight + totalIceCreamWeight; // Здесь очевидно должен быть int, но с ним при делении на 1000 результат был 1.0, преведения и округления мы еще не изучали, поэтому float
      float totalWeightOfBreakfastKillo = totalWeightOfBreakfastGrams / 1000;
       System.out.println("Вес спот завтрака в граммах - " + totalWeightOfBreakfastGrams + " грамм, в килограммах - " + totalWeightOfBreakfastKillo + " килограмм.");
      //изначально можно было решать через float и указывать значения 0.2 итд.

    //task 7
      int weight = 7;
      float minWeight = 0.25f;
      float maxWeight = 0.5f;
      float minDays = weight / minWeight;
      float maxDays = weight / maxWeight;
      float midDays = (minDays + maxDays) / 2;
       System.out.println("В среднем для похудения потреюуется " + midDays + " дней");

    //task 8
      float rise = 1.1f;
      int monthInYear = 12;
      int mashaStartMoney = 67760;
      int denisStartMoney = 83690;
      int kristStartMoney = 76230;
      float mashaUpMoney = mashaStartMoney * rise;
      float denisUpMoney = denisStartMoney * rise;
      float kristUpMoney = kristStartMoney * rise;
      int mashaPayDayBefore = mashaStartMoney * monthInYear;
      int denisPayDayBefore = denisStartMoney * monthInYear;
      int kristPayDayBefore = kristStartMoney * monthInYear;
      float mashaPayDayAfter = mashaUpMoney * monthInYear;
      float denisPayDayAfter = denisUpMoney * monthInYear;
      float kristPayDaYAfter = kristUpMoney * monthInYear;
      float diffForMasha = mashaPayDayAfter - mashaPayDayBefore;
      float diffFroDenis = denisPayDayAfter - denisPayDayBefore;
      float diffForKris = kristPayDaYAfter - kristPayDayBefore;
      System.out.println("Маша теперь получает " + mashaUpMoney + " рублей. Годовой доход вырос на "+ diffForMasha);
      System.out.println("Денис теперь получает " + denisUpMoney + " рублей. Годовой доход вырос на "+ diffFroDenis);
      System.out.println("Кристина теперь получает " + kristUpMoney + " рублей. Годовой доход вырос на "+ diffForKris);

    }
}