package org.saparov.pattern.Strategy;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата " + amount + " тенге.Через PayPal с помощью email: " + email);
    }
}
