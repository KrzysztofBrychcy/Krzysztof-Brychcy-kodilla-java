package com.kodilla.good.patterns.challanges;

public class Product {
    private final String productName;
    private final int productQuantity;

    public Product(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
