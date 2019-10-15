package de.generics.strategy.pattern.entity.strategy;

import de.generics.strategy.pattern.entity.Cash;
import java.math.BigDecimal;

public class CashPaymentStrategy implements PaymentStrategy<Cash> {

  @Override
  public boolean payBill(Cash cash, BigDecimal amount) {

    BigDecimal subtract = cash.getAmount().subtract(amount);

    if (subtract.compareTo(BigDecimal.ZERO) > 0) {
      return true;
    } else {
      return false;
    }
  }
}
