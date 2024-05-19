package org.example.online_29.modals;

import lombok.Data;
import org.example.online_29.strategies.PaymentStrategy;

import java.time.LocalDateTime;


@Data
public class Payment {
    private String transactionId;
    private double amount;
    private LocalDateTime paymentDate;
    private PaymentStatus paymentStatus;

    public Payment(String transactionId, double amount, LocalDateTime paymentDate, PaymentStatus paymentStatus) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentDate = LocalDateTime.now();
        this.paymentStatus = PaymentStatus.INITIATED;
    }
    public void processPayment(PaymentStrategy paymentStrategy) {
        paymentStrategy.processPayment(this);
    }
}
