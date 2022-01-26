package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSumMonthTotal() {
        int expected = 180;
        int actual = service.sumMonth(month);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAvgProfitYaer() {
        double expected = 15;
        double actual = service.avgProfitYaer(month);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSalesMonth() {
        int expected = 8;
        int actual = service.maxSalesMonth(month);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSalesMonth() {
        int expected = 9;
        int actual = service.minSalesMonth(month);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthDownAvgProfitYaer() {
        double expected = 5;
        double actual = service.monthDownAvgProfitYaer(month);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthUpAvgProfitYaer() {
        double expected = 5;
        double actual = service.monthUpAvgProfitYaer(month);
        assertEquals(expected, actual);
    }
}