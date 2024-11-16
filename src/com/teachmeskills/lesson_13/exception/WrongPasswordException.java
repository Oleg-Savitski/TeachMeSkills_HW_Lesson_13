package com.teachmeskills.lesson_13.exception;

public class WrongPasswordException extends RuntimeException {

  public WrongPasswordException() {
    super();
  }

  public WrongPasswordException(String message) {
        super(message);
    }
}