package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDivAndSubtract(double first, double second) {
        return sum(divide(first, second), subtraction(first, second));
    }

    public static double sumAllOperation(double first, double second) {
        return sum(sumAndMultiply(first, second), sumDivAndSubtract(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета равен: " + sumDivAndSubtract(20, 10));
        System.out.println("Результат расчета равен: " + sumAllOperation(20, 10));
    }
}
