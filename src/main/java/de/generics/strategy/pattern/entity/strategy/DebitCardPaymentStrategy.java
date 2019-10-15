package de.generics.strategy.pattern.entity.strategy;

import de.generics.strategy.pattern.entity.DebitCard;
import java.math.BigDecimal;

public class DebitCardPaymentStrategy implements PaymentStrategy<DebitCard> {

  @Override
  public boolean payBill(DebitCard debitCard, BigDecimal amount) {
    BigDecimal subtract = debitCard.getAmount().subtract(amount);

    if (subtract.compareTo(BigDecimal.ZERO) > 0) {
      return true;
    } else {
      return false;
    }
  }

}
