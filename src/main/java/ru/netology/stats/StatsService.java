package ru.netology.stats;

public class StatsService {

    public int sumMonth(int[] month) {
        int sum = 0;
        for (int i : month) {
            sum += i;
        }
        return sum;
    }

    public double avgProfitYaer(int[] month) {
        return (double) sumMonth(month) / month.length;
    }

    public int maxSalesMonth(int[] month) {
        int count = 0;
        int tik = 0;
        for (int i = 0; i < month.length; i++) {
            if (count <= month[i]) {
                count = month[i];
                tik = i + 1;
            }
        }
        return tik;
    }

    public int minSalesMonth(int[] month) {
        int minMonth = 0;
        int monthe = 0;
        for (int mon : month) {
            if (mon <= month[minMonth]) {
                minMonth = monthe;
            }
            monthe = monthe + 1;
        }
        return minMonth + 1;
    }

    public double monthDownAvgProfitYaer(int[] month) {
        double avg = avgProfitYaer(month);
        int count = 0;

        for (int i : month) {
            if (i < avg) {
                count++;
            }
        }
        return count;
    }

    public double monthUpAvgProfitYaer(int[] month) {
        double avg = avgProfitYaer(month);
        int count = 0;

        for (int i : month)
            if (i > avg) {
                count++;
            }
        return count;
    }
}
