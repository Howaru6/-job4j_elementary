package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (name.isEmpty() || Character.isUpperCase(code) || Character.isDigit(name.codePointAt(0))) {
                break;
            }
            if (Character.isDigit(code) || isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code <= 65 || code >= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code <= 97 || code >= 122;
    }
}