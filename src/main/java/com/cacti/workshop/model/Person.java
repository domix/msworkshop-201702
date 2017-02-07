package com.cacti.workshop.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by domix on 2/3/17.
 */
@Getter
@Setter
public class Person {
  private String id;
  private String name;
  private String email;


  public static Person from(String id, String name, String email) {
    Person person = new Person();
    person.setEmail(email);
    person.setName(name);
    person.setId(id);
    return person;
  }
}
