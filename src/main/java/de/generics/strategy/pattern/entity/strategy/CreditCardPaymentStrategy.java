package de.generics.strategy.pattern.entity.strategy;

import de.generics.strategy.pattern.entity.CreditCard;
import java.math.BigDecimal;

public class CreditCardPaymentStrategy implements PaymentStrategy<CreditCard> {

  @Override
  public boolean payBill(CreditCard payment, BigDecimal amount) {

    BigDecimal subtract = payment.getAmount().subtract(amount);

    if (subtract.compareTo(BigDecimal.ZERO) > 0) {
      return true;
    } else {
      return false;
    }
  }

}
