package com.opensourcelibrary.security.exception;

public class SecurityException extends RuntimeException {

  private SecurityException(String message) {
    super(message);
  }

  public static SecurityException with(String message) {
    return new SecurityException(message);
  }
}
