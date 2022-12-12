package ru.job4j.array;

import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || isUpperCase(name.charAt(0)) || Character.isDigit(name.charAt(0))) {
            return false;
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code <= 65 || code >= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code <= 97 || code >= 122);
    }
}