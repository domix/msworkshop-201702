package com.cacti.workshop.business;

import lombok.Getter;

import java.io.Serializable;

/**
 * Created by domix on 2/3/17.
 */
public class NotFoundException extends RuntimeException {
  @Getter
  private final Serializable identifier;

  public NotFoundException(String message, Serializable identifier) {
    super(message);
    this.identifier = identifier;
  }
}
