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
    }
}

