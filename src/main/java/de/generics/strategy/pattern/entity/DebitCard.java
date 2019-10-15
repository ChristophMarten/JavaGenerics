package de.generics.strategy.pattern.entity;

import java.math.BigDecimal;

public class DebitCard implements Credit{

  private BigDecimal deposit;

  public DebitCard(BigDecimal deposit) {
    this.deposit = deposit;
  }

  @Override
  public BigDecimal getAmount() {
    return deposit;
  }
}
