package de.generics.strategy.pattern.entity.strategy;

import de.generics.strategy.pattern.entity.Cash;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CashPaymentStrategyTest {

  CashPaymentStrategy cashPaymentStrategy;

  @Before
  public void setUp() {
    cashPaymentStrategy = new CashPaymentStrategy();
  }

  @Test
  public void testPayBill() {
    Cash cash = new Cash(new BigDecimal(2000));

    boolean canPay = cashPaymentStrategy.payBill(cash, new BigDecimal(1000));

    Assert.assertTrue(canPay);
  }
}