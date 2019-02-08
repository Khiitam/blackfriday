package com.indev.blackfriday;

public class Product {
    int price;
    String type;
    int quantity;

    public Product(int quantity, String type, int price) {
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int setQuantity(int quantity) {
        this.quantity = quantity;
        return quantity;
    }
}
