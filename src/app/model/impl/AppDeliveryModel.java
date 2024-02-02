package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

import java.util.Scanner;

public class AppDeliveryModel implements AppModel{
    double[] deliverytax = {5,10};

//    @Override
//    public double calcPayment(Purchase purchase) {
//        double cost = purchase.getQuota() * purchase.getPrice();
//        if (cost <= 2000) {
//            return cost + cost * deliverytax[0] / 100;
//        } else {
//            return cost + cost * deliverytax[1] / 100;
//        }
//    }
    public double deliverPayment(Purchase purchase){
        double cost = purchase.getQuota()* purchase.getPrice();
        if (cost == 1){
            return cost + cost * deliverytax[0] / 100;
        }else {
            return cost;
        }
    }
}
