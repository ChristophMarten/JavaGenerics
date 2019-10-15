package de.generics.strategy.pattern.entity.strategy;

import de.generics.strategy.pattern.entity.DebitCard;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DebitCardPaymentStrategyTest {

  DebitCardPaymentStrategy debitCardPaymentStrategy;

  @Before
  public void setUp() {
    debitCardPaymentStrategy = new DebitCardPaymentStrategy();
  }


  @Test
  public void testPayBill() {
    DebitCard debitCard = new DebitCard(new BigDecimal(2000));

    boolean canPay = debitCardPaymentStrategy.payBill(debitCard, new BigDecimal(1000));

    Assert.assertEquals(true, canPay);
  }
}