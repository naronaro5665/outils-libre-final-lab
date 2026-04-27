package com.pricing;

import java.util.*;

public class PricingEngine {
    public double calc(double[] p, int[] q, String c, String d) {
        double s = 0;
        for(int i=0;i<p.length;i++) s = s + p[i]*q[i];
        double dis = 0;
        if(c.equals("VIP")) {
            if(d.equals("SAVE10")) dis = s * 0.1;
            else if(d.equals("SAVE20")) dis = s * 0.2;
            else dis = s * 0.05;
        } else {
            if(d.equals("SAVE10")) dis = s * 0.05;
            else if(d.equals("SAVE20")) dis = s * 0.1;
            else dis = 0;
        }
        double tax = (s - dis) * 0.1;
        double f = s - dis + tax;
        return f;
    }
}