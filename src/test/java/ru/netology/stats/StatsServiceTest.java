package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void shouldSumMonthTotal() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.sumMonth(month);
        assertEquals(expected, actual);
    }
    @Test
    void shouldAvgProfitYaer() {
        StatsService service = new StatsService();

        double expected = 15;
        double actual = service.avgProfitYaer(month);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMaxSalesMonth() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSalesMonth(month);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMinSalesMonth() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSalesMonth(month);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMonthDownAvgProfitYaer() {
        StatsService service = new StatsService();

        double expected = 5;
        double actual = service.monthDownAvgProfitYaer(month);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMonthUpAvgProfitYaer() {
        StatsService service = new StatsService();

        double expected = 7;
        double actual = service.monthUpAvgProfitYaer(month);
        assertEquals(expected, actual);
    }
}