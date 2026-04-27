package com.pricing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class PricingEngineRefactoredTest {
    
    private PricingEngineRefactored engine;
    
    @BeforeEach
    void setUp() {
        engine = new PricingEngineRefactored();
    }
    
    @Test
    @DisplayName("VIP with SAVE20 - should get 20% discount")
    void testVipWithSave20() {
        double[] prices = {100.0, 50.0};
        int[] quantities = {1, 2};
        Order order = new Order(prices, quantities, "VIP", "SAVE20");
        
        PriceResult result = engine.calculatePrice(order);
        
        // بدلاً من assertEquals العادي، استخدم assertAll مع رسائل
        assertAll("Price Calculation",
            () -> assertEquals(200.0, result.getSubtotal(), 0.01, 
                "Subtotal expected 200.0 but was " + result.getSubtotal()),
            () -> assertEquals(40.0, result.getDiscountAmount(), 0.01,
                "Discount expected 40.0 but was " + result.getDiscountAmount()),
            () -> assertEquals(16.0, result.getTax(), 0.01,
                "Tax expected 16.0 but was " + result.getTax()),
            () -> assertEquals(176.0, result.getFinalPrice(), 0.01,
                "Final price expected 176.0 but was " + result.getFinalPrice())
        );
    }
}
