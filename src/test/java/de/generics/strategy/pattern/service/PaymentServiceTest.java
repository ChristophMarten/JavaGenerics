package de.generics.strategy.pattern.service;

import de.generics.strategy.pattern.entity.Cash;
import de.generics.strategy.pattern.entity.CreditCard;
import de.generics.strategy.pattern.entity.Customer;
import de.generics.strategy.pattern.entity.DebitCard;
import de.generics.strategy.pattern.entity.PlasticChips;
import de.generics.strategy.pattern.exceptions.PaymentException;
import de.generics.strategy.pattern.exceptions.UnsupportedCreditType;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaymentServiceTest {

  private PaymentService paymentProcess;

  @Before
  public void setUp() {
    paymentProcess = new PaymentService();
  }

  @Test
  public void testDoCashPayment() throws PaymentException, UnsupportedCreditType {
    Customer peter = new Customer("Peter");
    Cash cash = new Cash(new BigDecimal(2000));
    BigDecimal billAmount = new BigDecimal(1000);

    boolean isPayed = paymentProcess.doPayment(peter, cash, billAmount);

    Assert.assertTrue(isPayed);
  }

  @Test
  public void testDoCreditCardPayment() throws PaymentException, UnsupportedCreditType {
    Customer peter = new Customer("Peter");
    CreditCard creditCard = new CreditCard(new BigDecimal(2000));
    BigDecimal billAmount = new BigDecimal(1000);

    boolean isPayed = paymentProcess.doPayment(peter, creditCard, billAmount);

    Assert.assertTrue(isPayed);
  }

  @Test
  public void testDoDebitCardPayment() throws PaymentException, UnsupportedCreditType {
    Customer peter = new Customer("Peter");
    DebitCard debitCard = new DebitCard(new BigDecimal(2000));
    BigDecimal billAmount = new BigDecimal(1000);

    boolean isPayed = paymentProcess.doPayment(peter, debitCard, billAmount);

    Assert.assertTrue(isPayed);
  }

  @Test(expected = PaymentException.class)
  public void testDoPaymentWithBiggerBillAmount() throws PaymentException, UnsupportedCreditType {
    Customer peter = new Customer("Peter");
    Cash cash = new Cash(new BigDecimal(2000));
    BigDecimal billAmount = new BigDecimal(3000);

    paymentProcess.doPayment(peter, cash, billAmount);
  }

  @Test(expected = UnsupportedCreditType.class)
  public void testDoPaymentWithPlasticChips() throws PaymentException, UnsupportedCreditType {
    Customer peter = new Customer("Peter");
    PlasticChips plasticChips = new PlasticChips();
    BigDecimal billAmount = new BigDecimal(3000);

    paymentProcess.doPayment(peter, plasticChips, billAmount);
  }
}