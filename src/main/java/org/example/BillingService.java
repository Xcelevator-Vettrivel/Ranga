package org.example;

public class BillingService {
    public int calculateFinalAmount() {
        Bill bill = new Bill();
        int total = bill.getBill();
        int tax = bill.getTax();
        return total + tax;
    }
}
