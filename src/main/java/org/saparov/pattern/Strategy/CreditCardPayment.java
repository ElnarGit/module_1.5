package org.saparov.pattern.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата " + amount + " тенге.С помощью кредитной карты: " + cardNumber);
    }
}
