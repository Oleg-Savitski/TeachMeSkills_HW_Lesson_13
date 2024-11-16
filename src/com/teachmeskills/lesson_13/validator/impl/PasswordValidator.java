package com.teachmeskills.lesson_13.validator.impl;

import com.teachmeskills.lesson_13.exception.WrongPasswordException;
import com.teachmeskills.lesson_13.validator.Validator;

public class PasswordValidator implements Validator {

    private boolean isThereFigure(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void validate(String password) throws WrongPasswordException {
        if (password == null || password.isEmpty()) {
            throw new WrongPasswordException("Password cannot be empty.");
        }
        if (password.length() > 20 || password.contains(" ") || !isThereFigure(password)) {
            throw new WrongPasswordException("Password must be less than 20 characters, cannot contain spaces, and must contain at least one digit.");
        }
    }

    //альтернатива решению.

    /*private boolean isThereFigureUsingContains(String str) {
        String digits = "0123456789";
        for (char digit : digits.toCharArray()) {
            if (str.contains(String.valueOf(digit))) {
                return true;
            }
        }
        return false;
    } */
}