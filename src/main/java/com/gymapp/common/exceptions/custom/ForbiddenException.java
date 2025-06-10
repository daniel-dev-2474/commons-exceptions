package com.gymapp.common.exceptions.custom;

import com.gymapp.common.exceptions.error.ErrorResponse;

public class ForbiddenException extends RuntimeException {
  private final ErrorResponse errorResponse;
  public ForbiddenException(String message, ErrorResponse errorResponse) {
    super(message);
    this.errorResponse = errorResponse;

  }

  public ForbiddenException(String message) {
    super(message);
    this.errorResponse = null;
  }

  public ErrorResponse getErrorResponse() {
    return errorResponse;
  }
}
