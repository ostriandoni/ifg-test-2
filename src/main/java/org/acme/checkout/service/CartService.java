package org.acme.checkout.service;

import org.acme.checkout.model.CheckoutData;

public interface CartService {
    void validate(CheckoutData data);
}
