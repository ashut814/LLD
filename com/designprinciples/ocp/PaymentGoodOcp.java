package com.designprinciples.ocp;
// step1: Define an abstract class for payment strategy

abstract class PaymentStrategy {
    public abstract void processPayment();
}

// step2: Create concrete classes for different payment strategies

class CreditCardPayment extends PaymentStrategy {
    @Override
    public void processPayment() {
        // process credit card payment
    }
}

class DebitCardPayment extends PaymentStrategy {
    @Override
    public void processPayment() {
        // process debit card payment
    }
}

class PayPalPayment extends PaymentStrategy {
    @Override
    public void processPayment() {
        // process PayPal payment
    }
}

public class PaymentGoodOcp {
    public void processPayment(PaymentStrategy paymentStrategy) {
        paymentStrategy.processPayment();
    }
}
