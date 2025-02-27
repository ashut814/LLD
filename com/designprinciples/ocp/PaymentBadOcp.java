package com.designprinciples.ocp;

public class PaymentBadOcp {
    public void processPayment(String type) {
        if(type.equals("CreditCard")) {
            // process credit card payment
        }
        else if(type.equals("DebitCard")) {
            // process debit card payment
        }
        else if(type.equals("PayPal")) {
            // process PayPal payment
        }
        else {
            // unknown payment type
        }
    }
}
