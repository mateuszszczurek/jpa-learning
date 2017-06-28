package com.employment.jee.ejb.session_beans;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import java.util.HashMap;

/**
 * Showcase of stateful session bean annotations
 */
@Stateful
public class ShoppingCart {

    private HashMap<String, Integer> items = new HashMap<String, Integer>();

    public void addItem(String item, int quantity) {
        Integer orderQuantity = items.get(item);
        if(orderQuantity == null) {
            orderQuantity = 0;
        }
        orderQuantity += quantity;
        items.put(item, orderQuantity);
    }

    @Remove
    public void checkout(int paymentId) {
        // checkout logic
        // ...
    }

    @Remove
    public void cancel() {
        // ...
    }


}
