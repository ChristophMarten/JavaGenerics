package de.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericsTest {

  private Generics generics;

  @Test
  public void testSimpleGeneric() {
    generics = new Generics();

    String values = generics.getValues();

    Assert.assertEquals("Oma Opa Baby", values);
  }

}
