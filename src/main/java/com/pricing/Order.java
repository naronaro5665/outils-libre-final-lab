package com.pricing;

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private final double[] prices;
    private final int[] quantities;
    private final String customerType;
    private final String discountCode;
    
    public Order(double[] prices, int[] quantities, String customerType, String discountCode) {
        this.prices = prices != null ? prices.clone() : new double[0];
        this.quantities = quantities != null ? quantities.clone() : new int[0];
        this.customerType = customerType;
        this.discountCode = discountCode;
    }
    
    public double[] getPrices() {
        return prices.clone();
    }
    
    public int[] getQuantities() {
        return quantities.clone();
    }
    
    public String getCustomerType() {
        return customerType;
    }
    
    public String getDiscountCode() {
        return discountCode;
    }
    
    public double calculateSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * quantities[i];
        }
        return subtotal;
    }
    
    public boolean isValid() {
        return prices.length == quantities.length;
    }
    
    @Override
    public String toString() {
        return "Order{" +
                "prices=" + Arrays.toString(prices) +
                ", quantities=" + Arrays.toString(quantities) +
                ", customerType='" + customerType + '\'' +
                ", discountCode='" + discountCode + '\'' +
                '}';
    }
}