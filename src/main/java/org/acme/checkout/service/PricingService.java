package org.acme.checkout.service;

import org.acme.checkout.model.CheckoutData;

public interface PricingService {
    double calculateTotal(CheckoutData data);
}
