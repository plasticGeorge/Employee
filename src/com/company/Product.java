package com.company;

import java.math.BigDecimal;

public class Product {
    static int productsCount;

    private String name;
    private  int code;
    private BigDecimal price;

    static{
        productsCount = 0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.code = productsCount++;
        this.price = new BigDecimal(price);
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.code = productsCount++;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
