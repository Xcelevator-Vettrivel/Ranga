package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillTest {

    @Test
    void testGetBill() {
        Bill bill = new Bill();
        int expectedTotal = 15 + 100 + 100; // 215
        int actualTotal = bill.getBill();

        assertEquals((float) expectedTotal, actualTotal);
    }
}
