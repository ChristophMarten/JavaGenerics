package de.generics.strategy.pattern.entity;

import java.math.BigDecimal;

public class PlasticChips implements Credit {

  @Override
  public BigDecimal getAmount() {
    return new BigDecimal(0);
  }
}
