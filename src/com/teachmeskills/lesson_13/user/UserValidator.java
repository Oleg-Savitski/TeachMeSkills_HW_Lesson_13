package com.teachmeskills.lesson_13.user;

import com.teachmeskills.lesson_13.exception.WrongLoginException;
import com.teachmeskills.lesson_13.exception.WrongPasswordException;
import com.teachmeskills.lesson_13.validator.impl.LoginValidator;
import com.teachmeskills.lesson_13.validator.impl.PasswordValidator;

public class UserValidator {

    public static void validateUser (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        LoginValidator loginValidator = new LoginValidator();
        PasswordValidator passwordValidator = new PasswordValidator();

        loginValidator.validate(login);

        passwordValidator.validate(password);

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmation do not match.");
        }
    }
}