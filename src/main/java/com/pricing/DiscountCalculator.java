package com.pricing;

public class DiscountCalculator {
    private static final double TAX_RATE = 0.1;
    private static final double VIP_BASE_DISCOUNT = 0.05;
    private static final double REGULAR_BASE_DISCOUNT = 0.0;
    private static final double MAX_DISCOUNT = 0.5;
    
    public static double calculateDiscountRate(String customerType, String discountCode) {
        double codeRate = getDiscountCodeRate(discountCode);
        
        // إذا في كود خصم، يُطبق فقط (لا يُجمع مع VIP)
        if (codeRate > 0) {
            return Math.min(codeRate, MAX_DISCOUNT);
        }
        
        // إذا ما في كود، يُطبق خصم العميل الأساسي
        return getBaseDiscountRate(customerType);
    }
    
    private static double getBaseDiscountRate(String customerType) {
        if ("VIP".equalsIgnoreCase(customerType)) {
            return VIP_BASE_DISCOUNT;
        }
        return REGULAR_BASE_DISCOUNT;
    }
    
    private static double getDiscountCodeRate(String discountCode) {
        if (discountCode == null || discountCode.isEmpty()) {
            return 0;
        }
        
        switch (discountCode.toUpperCase()) {
            case "SAVE10": return 0.10;
            case "SAVE20": return 0.20;
            default: return 0;
        }
    }
    
    public static double calculateTax(double amount) {
        return amount * TAX_RATE;
    }
    
    public static double calculateDiscountAmount(double subtotal, String customerType, String discountCode) {
        double discountRate = calculateDiscountRate(customerType, discountCode);
        return subtotal * discountRate;
    }
}