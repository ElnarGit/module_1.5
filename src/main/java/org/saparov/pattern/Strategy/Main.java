package org.saparov.pattern.Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCard card = new ShoppingCard();

        PaymentStrategy creditCard = new CreditCardPayment("12345");
        PaymentStrategy payPal = new PayPalPayment("tom@mail.ru");

        card.setPaymentStrategy(creditCard);
        card.processPayment(1000);

        card.setPaymentStrategy(payPal);
        card.processPayment(500);
    }
}
