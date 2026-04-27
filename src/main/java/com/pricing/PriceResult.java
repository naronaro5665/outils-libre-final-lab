package com.pricing;

public class PriceResult {
    private final double subtotal;
    private final double discountAmount;
    private final double tax;
    private final double finalPrice;
    
    public PriceResult(double subtotal, double discountAmount, double tax, double finalPrice) {
        this.subtotal = subtotal;
        this.discountAmount = discountAmount;
        this.tax = tax;
        this.finalPrice = finalPrice;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    
    public double getDiscountAmount() {
        return discountAmount;
    }
    
    public double getTax() {
        return tax;
    }
    
    public double getFinalPrice() {
        return finalPrice;
    }
    
    public void print() {
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discountAmount);
        System.out.println("Tax: " + tax);
        System.out.println("Final: " + finalPrice);
    }
    
    @Override
    public String toString() {
        return "PriceResult{" +
                "subtotal=" + subtotal +
                ", discountAmount=" + discountAmount +
                ", tax=" + tax +
                ", finalPrice=" + finalPrice +
                '}';
    }
}