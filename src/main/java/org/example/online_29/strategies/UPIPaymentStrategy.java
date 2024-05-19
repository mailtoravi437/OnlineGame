package org.example.online_29.strategies;

import org.example.online_29.modals.Payment;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(Payment payment) {
        System.out.println("Processing payment using UPI "+payment.getAmount());
    }
}
