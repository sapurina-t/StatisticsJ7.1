package ru.netology.stats.StatisticsJ7.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsJ7Test {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void SalesAmount() {
        StatsService service = new StatsService();

        int expectedSum = 180;
        int actualSum = service.getSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void AverageSalesAmount() {
        StatsService service = new StatsService();

        int expectedASum = 15;
        int actualASum = service.AvSum(sales);

        Assertions.assertEquals(expectedASum, actualASum);
    }

    @Test
    public void mustFindTheMaximumSale() {
        StatsService service = new StatsService();

        int expectedMaxS = 8;
        int actualMaxS = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxS, actualMaxS);
    }

    @Test
    public void mustFindTheMinimumSale() {
        StatsService service = new StatsService();

        int expectedMinS = 9;
        int actualMinS = service.minSales(sales);

        Assertions.assertEquals(expectedMinS, actualMinS);
    }

    @Test
    public void mustFindHowManyMonthsWithBelowAverage() {
        StatsService service = new StatsService();

        int expectedMinCount = 5;
        int actualMinCount = service.belowAvSales(sales);

        Assertions.assertEquals(expectedMinCount, actualMinCount);
    }

    @Test
    public void mustFindHowManyMonthsWithAboveAverage() {
        StatsService service = new StatsService();

        int expectedMaxCount = 5;
        int actualMaxCount = service.aboveAvSales(sales);

        Assertions.assertEquals(expectedMaxCount, actualMaxCount);
    }

}
