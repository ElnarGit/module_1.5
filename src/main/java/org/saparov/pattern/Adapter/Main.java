package org.saparov.pattern.Adapter;

public class Main {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new AdapterUserToPaymentSystem();

        paymentSystem.processPayment();
        paymentSystem.getPaymentStatus();
    }
}
