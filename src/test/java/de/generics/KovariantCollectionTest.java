package de.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KovariantCollectionTest {

  private KovariantCollection kovariantCollection;

  @Before
  public void setUp() {
    kovariantCollection = new KovariantCollection();
  }

  @Test
  public void testDouble() {
    kovariantCollection.addDoubleValue(2D);

    Assert.assertTrue(kovariantCollection.getList().contains(2D));
  }

  @Test
  public void testLong() {
    kovariantCollection.addLongValue(2L);

    Assert.assertTrue(kovariantCollection.getList().contains(2L));
  }

  @Test(expected = ClassCastException.class)
  public void testIntegerCastError() {
    kovariantCollection.addIntegerValue("2");

    Assert.assertTrue(kovariantCollection.getList().contains(2));
  }

  @Test
  public void testInteger() {
    kovariantCollection.addIntegerValue(2);

    Assert.assertTrue(kovariantCollection.getList().contains(2));
  }
}
