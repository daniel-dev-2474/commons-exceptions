package com.gymapp.common.exceptions.custom;

import com.gymapp.common.exceptions.error.ErrorResponse;

public class ResourceNotFoundException extends RuntimeException {

  private final ErrorResponse errorResponse;
  public ResourceNotFoundException(String message, ErrorResponse errorResponse) {
    super(message);
    this.errorResponse = errorResponse;

  }

  public ResourceNotFoundException(String message) {
    super(message);
    this.errorResponse = null;
  }

  public ErrorResponse getErrorResponse() {
    return errorResponse;
  }
}