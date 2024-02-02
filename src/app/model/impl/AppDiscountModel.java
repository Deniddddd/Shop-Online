package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppDiscountModel implements AppModel {

    double[] discountRates = {5, 10};

    @Override
    public double calcPayment(Purchase purchase) {
        double cost = purchase.getQuota() * purchase.getPrice();
        if (cost <= 2000) {
            return cost - cost * discountRates[0] / 100;
        } else {
            return cost - cost * discountRates[1] / 100;
        }
    }
}
