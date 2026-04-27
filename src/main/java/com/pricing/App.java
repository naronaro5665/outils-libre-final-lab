package com.pricing;

public class App {
    public static void main(String[] args) {
        // استخدام النسخة المحسنة
        PricingEngineRefactored engine = new PricingEngineRefactored();
        
        // إنشاء طلب
        double[] prices = {100.0, 50.0, 25.0};
        int[] quantities = {2, 3, 4};
        Order order = new Order(prices, quantities, "VIP", "SAVE20");
        
        // حساب السعر
        PriceResult result = engine.calculatePrice(order);
        
        // عرض النتيجة
        result.print();
    }
}