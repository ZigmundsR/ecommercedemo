package com.zigmunds.rieksts.ecommercedemo.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.zigmunds.rieksts.ecommercedemo.dto.PaymentInfo;
import com.zigmunds.rieksts.ecommercedemo.dto.Purchase;
import com.zigmunds.rieksts.ecommercedemo.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
