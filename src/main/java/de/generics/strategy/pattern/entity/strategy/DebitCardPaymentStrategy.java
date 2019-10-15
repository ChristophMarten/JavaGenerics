package de.generics.strategy.pattern.entity.strategy;

import de.generics.strategy.pattern.entity.DebitCard;
import java.math.BigDecimal;

public class DebitCardPaymentStrategy implements PaymentStrategy<DebitCard> {

  @Override
  public boolean payBill(DebitCard payment, BigDecimal amount) {
    BigDecimal subtract = payment.getAmount().subtract(amount);

    if (subtract.compareTo(BigDecimal.ZERO) > 0) {
      return true;
    } else {
      return false;
    }
  }

}
