package com.quaildev.sample.pojo;

import com.quaildev.sample.pojo.visitor.OrderVisitor;

import java.util.List;

public class Order {

    private Customer customer;
    private List<LineItem> lineItems;

    public final void accept(OrderVisitor visitor) {
        visitor.visit(this);
        customer.accept(visitor);
        lineItems.forEach(li -> li.accept(visitor));
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

}
