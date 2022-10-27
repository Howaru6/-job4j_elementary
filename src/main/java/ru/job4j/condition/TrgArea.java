package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = -1;
        double p = (a + b + c) / 2;
        double formula = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return formula;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);

    }
}