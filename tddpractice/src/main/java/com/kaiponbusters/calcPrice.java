package com.kaiponbusters;

public class calcPrice {
    public static int calcPrice(int unitPrice, int quantity) {
        if(quantity < 10) {
            return unitPrice * quantity;
        }
        return (int)Math.ceil(unitPrice * quantity * 0.9);
    }
}
