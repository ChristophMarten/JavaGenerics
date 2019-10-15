package de.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnlimitedParameterPolymorphTest {

  private UnlimitedParameterPolymorph unlimitedParameterPolymorph;

  @Before
  public void setUp() {
    unlimitedParameterPolymorph = new UnlimitedParameterPolymorph();
  }

  @Test
  public void testAddDoubleValue() {
    unlimitedParameterPolymorph.addDoubleValue(2D);

    Assert.assertTrue(unlimitedParameterPolymorph.getList().contains(2D));
  }

  @Test
  public void testAddNumberValue() {

    unlimitedParameterPolymorph.addNumberValue(2L);

    Assert.assertTrue(unlimitedParameterPolymorph.getList().contains(2L));
  }
}