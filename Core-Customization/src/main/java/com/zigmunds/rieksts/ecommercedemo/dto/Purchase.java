package com.zigmunds.rieksts.ecommercedemo.dto;

import com.zigmunds.rieksts.ecommercedemo.entity.Address;
import com.zigmunds.rieksts.ecommercedemo.entity.Customer;
import com.zigmunds.rieksts.ecommercedemo.entity.Order;
import com.zigmunds.rieksts.ecommercedemo.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
