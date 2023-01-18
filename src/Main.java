public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int total = 0;
        int i = 1;
        while ( total <= 2_459_000) {
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            i++;
        }
        System.out.println("Задача 2");
        int s = 1;
        while ( s <= 10){
            System.out.print(s + " ");
            s++;
        }
        System.out.println();
        for (int a = 10; a >= 1; a= a-1) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int death = 8;
        int birthrate = 17;
        int years = 10;
        int difference = birthrate - death;
        for ( int year = 1; year <= years; year ++) {
            population = population/1000 * difference + population;
            System.out.println("Год " +year +", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        int investment = 15_000;
        int wanted = 12_000_000;
        int month = 1;
        double percent = 0.07;
        while (investment < wanted) {
            investment = investment + (int) (investment * percent);
            System.out.println("Месяц " + month + " сумма накоплений равна " + investment + " рублей");
            month++;
        }
        System.out.println("Задача 5");
        int wanted1 = 12_000_000;
        int investment1 = 15_000;
        int months = 1;
        double percent1 = 7 / 100D;
        while (investment1 < wanted1) {
            investment1 = investment1 + (int) (investment1 * percent1);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " сумма накоплений равна " + investment1 + " рублей");
            }
            months++;
        }
        System.out.println("Задача 6");
        int months1 = 9*12;
        int investment2 = 15_000;
        double percent2 = 7 / 100D;
        for (month  = 1; month <= months1; month ++) {
            investment2 = investment2 + (int) (investment2 * percent2);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + investment2 + " рублей");
            }
        }
        System.out.println("Задача 7");
        int fridayFirst = 2;
        for (int friday = fridayFirst; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " +friday + "-е число. Необходимо подготовить отчет»");
        }
        System.out.println("Задача 8");
        int now = 2023;
        int pastYears = now -200;
        int futureYears = now +100;
        int firstKometa = 0;
        int period = 79;
        for (int kometa = pastYears; kometa <= futureYears ; kometa++) {
            if (kometa % period == firstKometa) {
                System.out.println(kometa);
            }
        }
    }
}

