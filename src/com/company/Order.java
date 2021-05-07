package com.company;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Order {
    private static int ordersCount;

    private int orderID;
    private Name customerName;
    private PhoneNumber phoneNumber;
    private PayMethod paymentMethod;
    private String code;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private Set<Product> products = new HashSet<>();
    private BigDecimal summaryPrice;
    private boolean isDelivered;

    public enum PayMethod {
        CASH,
        CARD,
        PREPAYMENT
    }

    static{
        ordersCount = 0;
    }

    public Order(Name customerName,
                 PhoneNumber phoneNumber,
                 PayMethod payMethod,
                 LocalDate orderDate,
                 Set<Product> products){
        orderID = ordersCount++;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.paymentMethod = payMethod;
        code = generateUniqueCode();
        this.orderDate = orderDate;
        deliveryDate = orderDate.plusDays(3);
        this.products = products;
        summaryPrice = new BigDecimal(0);
        for(Product s : products)
            summaryPrice = summaryPrice.add(s.getPrice());
    }

    public Order(Name customerName,
                 PhoneNumber phoneNumber,
                 PayMethod payMethod,
                 Set<Product> products){
        this(customerName, phoneNumber, payMethod, LocalDate.now(), products);
    }

    public static int getOrdersCount() {
        return ordersCount;
    }

    public int getOrderID() {
        return orderID;
    }

    public Name getCustomerName() {
        return customerName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public PayMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getCode() {
        return code;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public BigDecimal getSummaryPrice() {
        return summaryPrice;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    private String generateUniqueCode(){
        Random randomGenerator = new Random(System.nanoTime() * phoneNumber.getNumber());
        StringBuilder builder = new StringBuilder(8);
        for(int i = 0; i < 8; i++)
            builder.append((char)(Math.abs(randomGenerator.nextInt()) % 26 + 97));
        return builder.toString();
    }
}
