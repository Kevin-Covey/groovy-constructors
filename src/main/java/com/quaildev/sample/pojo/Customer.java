package com.quaildev.sample.pojo;

import com.quaildev.sample.pojo.visitor.OrderVisitor;

public class Customer {

    private String firstName;
    private String lastName;
    private Address billingAddress;
    private Address shippingAddress;

    public final void accept(OrderVisitor visitor) {
        visitor.visit(this);
        billingAddress.accept(visitor);
        shippingAddress.accept(visitor);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
