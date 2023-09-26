package org.saparov.pattern.Adapter;

public class AdapterUserToPaymentSystem extends User implements PaymentSystem{
    @Override
    public void processPayment() {
        infoPayment();
    }

    @Override
    public void getPaymentStatus() {
        getStatus();
    }
}
