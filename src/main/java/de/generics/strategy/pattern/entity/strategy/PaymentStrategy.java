package de.generics.strategy.pattern.entity.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy<T> {

  boolean payBill(T payment, BigDecimal amount);

}
