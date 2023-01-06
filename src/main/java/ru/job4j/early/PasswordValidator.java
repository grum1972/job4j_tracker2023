package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {

    public static String validate(String password) {
        boolean hasDigit = false;
        boolean hasLowerCaseLetter = false;
        boolean hasUpperCaseLetter = false;
        boolean hasSpecialSymbol = false;

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        String[] words = {"qwerty", "12345", "password", "admin", "user"};

        for (String word : words) {
            if (password.toLowerCase().contains(word.toLowerCase())) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (hasDigit && hasLowerCaseLetter && hasUpperCaseLetter && hasSpecialSymbol) {
                break;
            }
            int symbol = password.charAt(i);
            if (isDigit(symbol)) {
                hasDigit = true;
            } else if (isLowerCase(symbol)) {
                hasLowerCaseLetter = true;
            } else if (isUpperCase(symbol)) {
                hasUpperCaseLetter = true;
            } else if (!isLetter(symbol) && !isDigit(symbol)) {
                hasSpecialSymbol = true;
            }
        }

        if (!hasUpperCaseLetter) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }

        if (!hasLowerCaseLetter) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }

        if (!hasDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        if (!hasSpecialSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        return password;
    }
}
