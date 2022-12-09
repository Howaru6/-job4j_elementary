package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || isUpperLatinLetter(name.charAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95) && !Character.isDigit(code);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code <= 65 || code >= 90) && !Character.isDigit(code);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code <= 97 || code >= 122) && !Character.isDigit(code);
    }
}