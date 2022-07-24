package ru.job4j.array;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int c = num - (num / 10) * 10;
            num = num / 10;
            sum += c;
        }
        return sum;
    }
}
