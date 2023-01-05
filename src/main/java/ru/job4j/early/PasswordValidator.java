package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {
    private static boolean hasDigit(String string) {
        for (int i = 0; i < string.length(); i++) {
            int symbol = string.charAt(i);
            if (isDigit(symbol)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasLowerCaseLetter(String string) {
        for (int i = 0; i < string.length(); i++) {
            int symbol = string.charAt(i);
            if (isLowerCase(symbol)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasUpperCaseLetter(String string) {
        for (int i = 0; i < string.length(); i++) {
            int symbol = string.charAt(i);
            if (isUpperCase(symbol)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasSpecialSymbol(String string) {
        for (int i = 0; i < string.length(); i++) {
            int symbol = string.charAt(i);
            if (!isLetter(symbol) && !isDigit(symbol)) {
                return true;
            }
        }
        return false;
    }

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        if (!hasUpperCaseLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }

        if (!hasLowerCaseLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }

        if (!hasDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        if (!hasSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        if (password.toLowerCase().contains("qwerty".toLowerCase())
                || password.toLowerCase().contains("12345".toLowerCase())
                || password.toLowerCase().contains("password".toLowerCase())
                || password.toLowerCase().contains("admin".toLowerCase())
                || password.toLowerCase().contains("user".toLowerCase())) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }

        return password;
    }
}
