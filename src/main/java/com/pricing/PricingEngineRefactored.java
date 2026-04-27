package com.pricing;

public class PricingEngineRefactored {
    
    public PriceResult calculatePrice(Order order) {
        validateOrder(order);
        
        double subtotal = order.calculateSubtotal();
        double discountAmount = DiscountCalculator.calculateDiscountAmount(
            subtotal, 
            order.getCustomerType(), 
            order.getDiscountCode()
        );
        double afterDiscount = subtotal - discountAmount;
        double tax = DiscountCalculator.calculateTax(afterDiscount);
        double finalPrice = afterDiscount + tax;
        
        // للتصحيح: اطبع القيم لترى أين الخطأ
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount Rate: " + DiscountCalculator.calculateDiscountRate(
            order.getCustomerType(), order.getDiscountCode()));
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("After Discount: " + afterDiscount);
        System.out.println("Tax: " + tax);
        System.out.println("Final: " + finalPrice);
        
        return new PriceResult(subtotal, discountAmount, tax, finalPrice);
    }
    
    private void validateOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
        
        if (!order.isValid()) {
            throw new IllegalArgumentException(
                "Prices and quantities arrays must have the same length"
            );
        }
    }
}