package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

            public static void main(String[]args) {
                System.out.println(sum(0, 10));
                System.out.println(sum(3, 8));
                System.out.println(sum(1, 1));

                System.out.println(sumByEven(0, 10));
                System.out.println(sumByEven(3, 8));
                System.out.println(sumByEven(1, 1));
            }
        }
