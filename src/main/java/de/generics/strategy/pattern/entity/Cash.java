package de.generics.strategy.pattern.entity;

import java.math.BigDecimal;

public class Cash implements Credit{

  private BigDecimal amount;

  public Cash(BigDecimal amount) {
    this.amount = amount;
  }

  public BigDecimal getAmount() {
    return amount;
  }

}

