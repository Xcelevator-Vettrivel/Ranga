package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillingIntegrationTest {

    @Test
    void testFinalBillingAmount() {
        BillingService service = new BillingService();
        int finalAmount = service.calculateFinalAmount();

        // Bill = 215, Tax = 98 → Final = 313
        assertEquals(313, finalAmount);
    }
}
