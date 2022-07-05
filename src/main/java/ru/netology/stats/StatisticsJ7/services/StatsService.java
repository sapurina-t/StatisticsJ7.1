package ru.netology.stats.StatisticsJ7.services;

public class StatsService {

    public int getSum(int[] sales) {
        int total = 0;
        for (int s : sales) {
            total = total + s;
        }
        return total;
    }

    public int AvSum(int[] sales) {
        int total = getSum(sales);
        int HowManyMonths = 0;
        for (int sale : sales) {
            HowManyMonths++;
        }
        int arithmeticalMean = total / HowManyMonths;
        return arithmeticalMean;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAvSales(int[] sales) {
        int arithmeticalMean = AvSum(sales);
        int HowManyMonthsMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < arithmeticalMean) {
                HowManyMonthsMin++;
            }
        }
        return HowManyMonthsMin;
    }

    public int aboveAvSales(int[] sales) {
        int arithmeticalMean = AvSum(sales);
        int HowManyMonthsMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > arithmeticalMean) {
                HowManyMonthsMax++;
            }
        }
        return HowManyMonthsMax;
    }

}
