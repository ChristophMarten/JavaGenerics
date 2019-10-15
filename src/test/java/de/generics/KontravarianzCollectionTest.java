package de.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KontravarianzCollectionTest {

  private KontravarianzCollection kontravarianzCollection;

  @Before
  public void setUp() {
    kontravarianzCollection = new KontravarianzCollection();
  }

  @Test
  public void testAddDoubleValue() {
    kontravarianzCollection.addDoubleValue(2D);

    Assert.assertTrue(kontravarianzCollection.getList().contains(2D));
  }

  @Test
  public void testAddNumberValue() {
    kontravarianzCollection.addNumberValue(2);

    boolean isInteger = kontravarianzCollection.getList().get(0) instanceof Integer;

    Assert.assertTrue(kontravarianzCollection.getList().contains(2));
    Assert.assertTrue(isInteger);
  }

  // List<? super Double> list -> kein Fehler, da eine (List<Number>) list hinzugefügt wird, in die dann ein Long Wert geschrieben wird.
  @Test
  public void testAddLongValue() {
    kontravarianzCollection.addLongValue(2L);

    Assert.assertTrue(kontravarianzCollection.getList().contains(2L));
  }
}