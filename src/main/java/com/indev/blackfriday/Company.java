package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {


    Map<String,Product> stock = new HashMap<String, Product>();




    public void stock(int quantity, String type, int price) {

        Product product = new Product(quantity,type,price);
        stock.put(type,product);

    }





    public int totalAssets() {
        int totalProducts=0;
        for (Map.Entry<String, Product> entry : stock.entrySet()) {
            int sommeProducts = (int) (( entry.getValue().getPrice()   *   entry.getValue().getQuantity() ) + sells(entry.getKey())) ;
            totalProducts= totalProducts+sommeProducts;
        }
        return totalProducts ;
    }

    public float sells(String capsule) {
        float saleprice1=0;
        for (Map.Entry<String, Product> entry : stock.entrySet()) {
         if(entry.getKey().equals("capsule")){
            float price=entry.getValue().getPrice();
            int quantity = entry.getValue().setQuantity(entry.getValue().getQuantity()-5) ;
            return (5f*price*1.2f);

         }


        }


        return  0;

    }
    public void salesHistory(){



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


}
