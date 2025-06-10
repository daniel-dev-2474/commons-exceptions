package com.gymapp.common.exceptions.custom;

import com.gymapp.common.exceptions.error.ErrorResponse;

public class BadRequestException extends RuntimeException {
  private final ErrorResponse errorResponse;
  public BadRequestException(String message, ErrorResponse errorResponse) {
    super(message);
    this.errorResponse = errorResponse;

  }

  public BadRequestException(String message) {
    super(message);
    this.errorResponse = null;
  }

  public ErrorResponse getErrorResponse() {
    return errorResponse;
  }
}