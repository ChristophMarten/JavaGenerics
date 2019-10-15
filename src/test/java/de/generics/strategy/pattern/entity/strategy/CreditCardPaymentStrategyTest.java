package de.generics.strategy.pattern.entity.strategy;

import de.generics.strategy.pattern.entity.CreditCard;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreditCardPaymentStrategyTest {

  CreditCardPaymentStrategy creditCardStrategy;

  @Before
  public void setUp() {
    creditCardStrategy = new CreditCardPaymentStrategy();
  }


  @Test
  public void testPayBill() {
    CreditCard creditCard = new CreditCard(new BigDecimal(2000));

    boolean canPay = creditCardStrategy.payBill(creditCard, new BigDecimal(1000));

    Assert.assertTrue(canPay);
  }
}