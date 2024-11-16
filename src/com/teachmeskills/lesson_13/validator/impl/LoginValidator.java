package com.teachmeskills.lesson_13.validator.impl;

import com.teachmeskills.lesson_13.exception.WrongLoginException;
import com.teachmeskills.lesson_13.validator.Validator;

public class LoginValidator implements Validator {

    @Override
    public void validate(String login) throws WrongLoginException {
        if (login == null || login.isEmpty()) {
            throw new WrongLoginException("Login cannot be empty.");
        }
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be less than 20 characters and cannot contain spaces.");
        }
    }
}