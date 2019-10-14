package de.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericsTest {

  private Generics generics;
  
  @Before
  public void setUp(){
    generics = new Generics();
  }

  @Test
  public void testSimpleGeneric(){
    String values = generics.getValues();
    Assert.assertEquals("Oma Opa Baby",values);
  }

}
