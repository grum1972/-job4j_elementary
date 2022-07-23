package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean check = data[0];
        for (boolean el : data) {
            if (el != check) {
                return false;
            }
        }
        return true;
    }
}
