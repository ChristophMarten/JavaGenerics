package de.generics;

import org.junit.Assert;
import org.junit.Test;

public class DoubleObjectTest {

  private DoubleObject doubleObject;

  private DoubleObject doubleObject2;

  @Test
  public void testDoubleObject() {
     doubleObject = new DoubleObject("Text", 2);

     doubleObject2 = new DoubleObject(2.0f, 'C');

    String doubleObjectString = doubleObject.toString();

    String doubleObject2String = doubleObject2.toString();

    Assert
        .assertEquals("class java.lang.String Text, class java.lang.Integer 2", doubleObjectString);

    Assert.assertEquals("class java.lang.Float 2.0, class java.lang.Character C",
        doubleObject2String);

  }

}
