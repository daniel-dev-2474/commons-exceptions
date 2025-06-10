package com.gymapp.common.exceptions.custom;

import com.gymapp.common.exceptions.error.ErrorResponse;

public class BusinessValidationException extends RuntimeException {
  private final ErrorResponse errorResponse;
  public BusinessValidationException(String message, ErrorResponse errorResponse) {
    super(message);
    this.errorResponse = errorResponse;

  }

  public BusinessValidationException(String message) {
    super(message);
    this.errorResponse = null;
  }

  public ErrorResponse getErrorResponse() {
    return errorResponse;
  }
}
