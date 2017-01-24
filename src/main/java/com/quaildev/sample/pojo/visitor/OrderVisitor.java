package com.quaildev.sample.pojo.visitor;

import com.quaildev.sample.pojo.Address;
import com.quaildev.sample.pojo.Customer;
import com.quaildev.sample.pojo.LineItem;
import com.quaildev.sample.pojo.Order;

public interface OrderVisitor {

    default void visit(Order order) {
    }

    default void visit(Customer customer) {
    }

    default void visit(Address address) {
    }

    default void visit(LineItem lineItem) {
    }

}
