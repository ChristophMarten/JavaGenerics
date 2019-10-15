package de.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericBoxTest {

   private GenericBox genericBox;

   @Test
  public void testCreateIntegerBox(){

    genericBox = new GenericBox();
    genericBox.set(123);

    assertEquals(true, genericBox.get() instanceof Integer);
  }

  @Test
  public void testCreateStringBox(){
    genericBox = new GenericBox();
    genericBox.set("TestString");

    assertEquals(true, genericBox.get() instanceof String);
  }

}