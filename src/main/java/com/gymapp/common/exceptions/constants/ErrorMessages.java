package com.gymapp.common.exceptions.constants;

public class ErrorMessages {
  public static final String BAD_REQUEST = "The request is invalid or malformed.";
  public static final String UNAUTHORIZED = "Authentication is required to access this resource.";
  public static final String FORBIDDEN = "You do not have permission to access this resource.";
  public static final String NOT_FOUND = "The requested resource was not found.";
  public static final String BUSINESS_VALIDATION = "The operation failed due to a business rule violation.";
  public static final String EXTERNAL_SERVICE_ERROR = "An error occurred while communicating with an external service.";
  public static final String INTERNAL_SERVER_ERROR = "An unexpected error occurred. Please contact support.";

  private ErrorMessages() {}
}