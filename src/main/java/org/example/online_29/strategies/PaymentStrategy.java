package org.example.online_29.strategies;

import org.example.online_29.modals.Payment;

public interface PaymentStrategy {
    void processPayment(Payment payment);
}
