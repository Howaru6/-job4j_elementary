package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            nik *= 2;
            ivan *= 3;
            month += 1;
        }
        return month;
    }
}
