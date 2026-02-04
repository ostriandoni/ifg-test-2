package org.acme.checkout.service;

import org.acme.checkout.model.CheckoutData;

public interface PaymentService {
    boolean pay(CheckoutData data, double totalPrice);
}
