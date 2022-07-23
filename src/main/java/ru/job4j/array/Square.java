package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound, int pow) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            int result = 1;
            for (int i = 1; i <= pow; i++) {
                result *= index;
            }
            rst[index] = result;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4, 3);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
