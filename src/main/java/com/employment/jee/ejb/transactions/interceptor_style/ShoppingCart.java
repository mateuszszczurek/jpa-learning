package com.employment.jee.ejb.transactions.interceptor_style;

import javax.enterprise.context.SessionScoped;
import javax.transaction.Transactional;
import java.io.Serializable;

@Transactional
@SessionScoped
public class ShoppingCart implements Serializable {

    @Transactional(Transactional.TxType.SUPPORTS)
    public void addItem(String item, Integer quantity) {
        verifyItem(item, quantity);
        // ...
    }

    private void verifyItem(String item, Integer quantity) {
        // ...
    }

}
