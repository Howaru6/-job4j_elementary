package ru.job4j.array;

import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || isUpperCase(name.charAt(0)) || Character.isDigit(name.charAt(0))) {
            return false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code) ||  Character.isDigit(name.charAt(i))) {
                   return true;
                }
            }
        }
        return false;
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