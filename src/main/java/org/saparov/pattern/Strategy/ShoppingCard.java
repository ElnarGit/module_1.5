package org.saparov.pattern.Strategy;

public class ShoppingCard {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount){
        paymentStrategy.pay(amount);
    }
}
