package org.example.online_29.strategies;

import org.example.online_29.modals.Payment;

public class PaypalStrategy implements PaymentStrategy{
    double commissionPercentage = 0.02;
    @Override
    public void processPayment(Payment payment) {
        System.out.println("Processing payment using Paypal"+payment.getAmount()+" with commission "+payment.getAmount()*commissionPercentage);
    }
}
