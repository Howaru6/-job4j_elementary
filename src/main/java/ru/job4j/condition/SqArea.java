package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = -1;
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static double square1(double p1, double k1) {
        double rsl = -1;
        double h = p1 / (2 * (k1 + 1));
        double l = h * k1;
        double s1 = l * h;
        return s1;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square1(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result2);
    }
}

