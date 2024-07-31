package com.zigmunds.rieksts.ecommercedemo.service;

import com.zigmunds.rieksts.ecommercedemo.dto.Purchase;
import com.zigmunds.rieksts.ecommercedemo.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
