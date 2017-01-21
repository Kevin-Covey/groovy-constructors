package com.quaildev.sample

import com.quaildev.sample.pojo.Address
import com.quaildev.sample.pojo.Customer
import com.quaildev.sample.pojo.LineItem
import com.quaildev.sample.pojo.Order

class OrderFactory {

    Order createOrder() {
        new Order(
                customer: new Customer(
                        firstName: 'John',
                        lastName: 'Smith',
                        billingAddress: new Address(
                                street: '1 Business Ln',
                                city: 'Des Moines',
                                state: 'IA',
                                zip: 50309),
                        shippingAddress: new Address(
                                street: '1 Home Dr',
                                city: 'Monroe',
                                state: 'IA',
                                zip: 50170)),
                lineItems: [
                        new LineItem(
                                description: 'Echo Dot',
                                price: 49.99,
                                quantity: 1),
                        new LineItem(
                                description: 'Alexa:  The Ultimate Guide to Master Alexa',
                                price: 10.99,
                                quantity: 1),
                        new LineItem(
                                description: 'Beer',
                                price: 1.29,
                                quantity: 6)
                ]
        )
    }

}
