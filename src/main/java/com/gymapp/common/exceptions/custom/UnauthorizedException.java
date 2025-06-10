package com.gymapp.common.exceptions.custom;

import com.gymapp.common.exceptions.error.ErrorResponse;

public class UnauthorizedException extends RuntimeException {

  private final ErrorResponse errorResponse;
  public UnauthorizedException(String message, ErrorResponse errorResponse) {
    super(message);
    this.errorResponse = errorResponse;

  }

  public UnauthorizedException(String message) {
    super(message);
    this.errorResponse = null;
  }

  public ErrorResponse getErrorResponse() {
    return errorResponse;
  }
}
