package com.quaildev.sample

import spock.lang.Specification

class OrderFactoryTest extends Specification {

    def 'order creation'() {
        given:
        def factory = new OrderFactory()

        when:
        def order = factory.createOrder()

        then:
        with(order.customer) {
            firstName == 'John'
            lastName == 'Smith'
        }

        with(order.customer.billingAddress) {
            street == '1 Business Ln'
            city == 'Des Moines'
            state == 'IA'
            zip == 50309
        }

        with(order.customer.shippingAddress) {
            street == '1 Home Dr'
            city == 'Monroe'
            state == 'IA'
            zip == 50170
        }

        order.lineItems.size() == 3
        with(order.lineItems[0]) {
            description == 'Echo Dot'
            price == 49.99
            quantity == 1
        }
        with(order.lineItems[1]) {
            description== 'Alexa:  The Ultimate Guide to Master Alexa'
            price== 10.99
            quantity== 1
        }
        with(order.lineItems[2]) {
            description == 'Beer'
            price == 1.29
            quantity == 6
        }
    }

}
