package com.employment.jee.ejb.transactions.ejb_style;

import javax.ejb.*;

// container transaction management is the default one
@Stateful
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ShoppingCart {

    // can be a class level, or method level. Annotating a method level will always take precedence
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public void addItem(String item, Integer quantity) {
        verifyItem(item, quantity);
        // ...
    }

    private void verifyItem(String item, Integer quantity) {
        // ...
    }

}
