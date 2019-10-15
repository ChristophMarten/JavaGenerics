package de.generics.strategy.pattern.entity.strategy;

import de.generics.strategy.pattern.entity.Credit;
import java.math.BigDecimal;

public interface PaymentStrategy<T extends Credit> {

  boolean payBill(T credit, BigDecimal amount);

}
