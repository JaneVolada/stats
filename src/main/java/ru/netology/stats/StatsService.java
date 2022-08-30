package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {

        long mySumSales = 0;
        for (long sale : sales) {

            mySumSales = mySumSales + sale;
        }
        return mySumSales;
    }

    public long averageSumSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberOfMinMonths(long[] sales) {
        long myAverageSumSales = averageSumSales(sales);
        int myNumberOfMinMonth = 0;
        for (long sale : sales) {
            if (sale < myAverageSumSales) {
                myNumberOfMinMonth++;
            }
        }
        return myNumberOfMinMonth;

    }

    public int numberOfMaxMonths(long[] sales) {
        long myAverageSumSales = averageSumSales(sales);
        int myNumberOfMaxMonth = 0;
        for (long sale : sales) {
            if (sale > myAverageSumSales) {
                myNumberOfMaxMonth++;
            }
        }
        return myNumberOfMaxMonth;

    }


}
