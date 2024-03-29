package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppBaseModel implements AppModel {

    @Override
    public double deliverPayment(Purchase purchase) {
        return purchase.getQuota() * purchase.getPrice();
    }
}
