package com.company;

import java.math.BigDecimal;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        PhoneNumber number = new PhoneNumber(89534305475l);
        Name name = new Name("Иванов Иван Иванович");
        HashSet<Product> products = new HashSet<>();
        products.add(new Product("Маккароны", new BigDecimal("75.75")));
        products.add(new Product("Сухарики", new BigDecimal("17.99")));
        products.add(new Product("Лазанья быстрого приготовления", new BigDecimal("345.45")));
        products.add(new Product("Шампунь", new BigDecimal("220.20")));
        Order order = new Order(name, number, Order.PayMethod.CARD, products);
        System.out.println(order.getCode());
        System.out.println(order.getPhoneNumber().getNumberAsString());
        System.out.println(order.getOrderID());
        System.out.println(order.getSummaryPrice());
    }
}
