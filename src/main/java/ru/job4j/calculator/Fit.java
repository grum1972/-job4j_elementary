package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        short womanHeight = 160;
        System.out.println(Fit.manWeight(manHeight));
        System.out.println(Fit.womanWeight(womanHeight));
    }
}
