package ru.netology.stats;

public class StatsService {

    public long salesSum(long[] sales) {
        long sum = 0;

        for (int month = 0; month < sales.length; month++) {
            sum = sum + sales[month];
        }
        return sum;
    }

    public long salesAverageAmount(long[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int lowerThanAverage(long[] sales) {
        int lower = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAverageAmount(sales)) {
                lower++;
            }
        }

        return lower;
    }

    public int higherThanAverage(long[] sales) {
        int higher = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAverageAmount(sales)) {
                higher++;
            }
        }

        return higher;
    }
}
