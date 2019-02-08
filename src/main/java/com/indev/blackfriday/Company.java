package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {


    Map<String,Product> stock = new HashMap<String, Product>();




    public void stock(int price, String type, int quantity) {

        Product product = new Product(price,type,quantity);
        stock.put(type,product);

    }



    public int totalAssets() {
        int totalProducts=0;
        for (Map.Entry<String, Product> entry : stock.entrySet()) {
            int sommeProducts =  ( entry.getValue().getPrice() )  *   ( entry.getValue().getQuantity() ) ;
            totalProducts= totalProducts+sommeProducts;
        }
        return totalProducts;
    }





    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }



    public Company blackFriday() {
        return this;
    }

    public float sells(String capsule) {
        return 0;
    }
}
