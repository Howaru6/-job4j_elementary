package ru.job4j;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {5, 6}, {9, 10, 11}, {13, 14, 15, 16}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: " + numbers[i].length);
        }
    }
}

