package com.pricing;

import java.util.List;

public class App {

    public static double calc(List<Integer> prices, List<Integer> qtys,
                               String customer, String code) {
        double total = 0;
        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i) * qtys.get(i);
        }

        // discount
        double disc = 0;
        if (code.equals("SAVE10")) disc = total * 0.10;
        else if (code.equals("SAVE20")) disc = total * 0.20;
        else if (customer.equals("VIP")) disc = total * 0.15;

        total = total - disc;

        // tax
        double tax = total * 0.19;
        total = total + tax;

        System.out.println("Subtotal: " + (total - tax + disc));
        System.out.println("Discount: " + disc);
        System.out.println("Tax: " + tax);
        System.out.println("Final: " + total);

        return total;
    }

    public static void main(String[] args) {
        calc(List.of(100, 200), List.of(2, 1), "VIP", "SAVE10");
    }
}