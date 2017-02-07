package com.cacti.workshop.web;

import com.cacti.workshop.business.NotFoundException;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by domix on 2/3/17.
 */
public class PersonsControllerTests {

  @Test
  public void shouldFindAPersonById() throws Throwable {
    PersonsController personsController = new PersonsController();
    personsController.init();
    assertNotNull(personsController.findById("domix"));
  }

  /*@Test(expected = NotFoundException.class)
  public void shouldFailDueNotFoundPerson() throws Throwable {
    PersonsController personsController = new PersonsController();
    personsController.init();
    personsController.findById("domssix");
  }*/
}
