package com.tabular.tabular.entity;

public class Customer {
    private long customerId;
    private String name;

    public Customer() {
    }

    public Customer(long customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
