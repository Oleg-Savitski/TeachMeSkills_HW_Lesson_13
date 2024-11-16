package com.teachmeskills.lesson_13.exception;

public class WrongLoginException extends RuntimeException {

  public WrongLoginException() {
    super();
  }

  public WrongLoginException(String message) {
        super(message);
    }
}