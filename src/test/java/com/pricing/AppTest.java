package com.pricing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class AppTest {

    @Test
    void testRegularCustomerNoDiscount() {
        double result = App.calc(List.of(100), List.of(1), "REGULAR", "");
        assertEquals(119.0, result, 0.01);
    }

    @Test
    void testSave10Discount() {
        double result = App.calc(List.of(100), List.of(1), "REGULAR", "SAVE10");
        assertEquals(107.1, result, 0.01);
    }

    @Test
    void testVipDiscount() {
        double result = App.calc(List.of(100), List.of(1), "VIP", "");
        assertEquals(101.15, result, 0.01);
    }
}