package de.generics.strategy.pattern.service;

import de.generics.strategy.pattern.entity.Cash;
import de.generics.strategy.pattern.entity.Credit;
import de.generics.strategy.pattern.entity.CreditCard;
import de.generics.strategy.pattern.entity.Customer;
import de.generics.strategy.pattern.entity.DebitCard;
import de.generics.strategy.pattern.entity.strategy.CashPaymentStrategy;
import de.generics.strategy.pattern.entity.strategy.CreditCardPaymentStrategy;
import de.generics.strategy.pattern.entity.strategy.DebitCardPaymentStrategy;
import de.generics.strategy.pattern.entity.strategy.PaymentStrategy;
import de.generics.strategy.pattern.exceptions.PaymentException;
import de.generics.strategy.pattern.exceptions.UnsupportedCreditType;
import java.math.BigDecimal;

public class PaymentService {

  private PaymentStrategy paymentStrategy;

  public boolean doPayment(Customer customer, Credit credit, BigDecimal amount)
      throws PaymentException, UnsupportedCreditType {

    choosePaymentStrategy(credit);

    if (!paymentStrategy.payBill(credit, amount)) {

      throw new PaymentException(customer.getName() + " can't pay");
    }
    return true;
  }

  private void choosePaymentStrategy(Credit credit) throws UnsupportedCreditType {
    if (credit instanceof Cash) {
      paymentStrategy = new CashPaymentStrategy();
    } else if (credit instanceof CreditCard) {
      paymentStrategy = new CreditCardPaymentStrategy();
    } else if (credit instanceof DebitCard) {
      paymentStrategy = new DebitCardPaymentStrategy();
    } else {
      throw new UnsupportedCreditType("Unknown Credit Type");
    }
  }

}