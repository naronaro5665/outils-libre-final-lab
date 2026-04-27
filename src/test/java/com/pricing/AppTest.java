package com.pricing;

import org.junit.jupiter.api.Test;           // ← تأكد من هذا الـ import
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    
    private PricingEngine engine;
    
    @BeforeEach
    void setUp() {
        engine = new PricingEngine();
    }
    
    @Test                              // ← يجب أن يكون قبل كل دالة اختبار
    @DisplayName("Regular customer without discount - no discount")
    void testRegularCustomerNoDiscount() {
        // ... المحتوى
    }
    
    @Test                              // ← يجب أن يكون هنا
    @DisplayName("Regular customer with SAVE10 - gets 5% discount")
    void testSave10Discount() {
        // ... المحتوى
    }
    
    @Test                              // ← يجب أن يكون هنا
    @DisplayName("VIP customer without discount - gets 5% base discount")
    void testVipDiscount() {
        // ... المحتوى
    }
    
    @Test                              // ← يجب أن يكون هنا
    @DisplayName("VIP customer with SAVE20 - gets 20% discount")
    void testVipWithSave20() {
        // ... المحتوى
    }
    
    @Test                              // ← يجب أن يكون هنا
    @DisplayName("VIP customer with SAVE10 - gets 10% discount")
    void testVipWithSave10() {
        // ... المحتوى
    }
    
    @Test                              // ← يجب أن يكون هنا
    @DisplayName("Multiple items with VIP and SAVE20")
    void testMultipleItemsVipSave20() {
        // ... المحتوى
    }
    
    @Test                              // ← يجب أن يكون هنا
    @DisplayName("Edge case - zero quantity items")
    void testZeroQuantity() {
        // ... المحتوى
    }
    
    @Test                              // ← يجب أن يكون هنا
    @DisplayName("Edge case - zero price items")
    void testZeroPrice() {
        // ... المحتوى
    }
}