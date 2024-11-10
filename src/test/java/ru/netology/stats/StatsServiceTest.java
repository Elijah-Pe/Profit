package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    //    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/stats.csv")
//    public void calculateSalesSum(int[] sales, int expected)
    @Test
    public void calculateSalesSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.salesSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateAverageAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180 / sales.length;

        long actual = service.salesAverageAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerThanAverageMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.lowerThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherThanAverageMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.higherThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
