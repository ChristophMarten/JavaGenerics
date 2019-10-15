package de.generics.strategy.pattern.entity;

import java.math.BigDecimal;

public class CreditCard implements Credit{

  private BigDecimal creditLine;

  public CreditCard(BigDecimal creditLine) {
    this.creditLine = creditLine;
  }

  @Override
  public BigDecimal getAmount() {
    return creditLine;
  }
}
