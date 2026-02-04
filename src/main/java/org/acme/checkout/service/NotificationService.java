package org.acme.checkout.service;

import org.acme.checkout.model.CheckoutData;

public interface NotificationService {
    void notifyCustomer(CheckoutData data, String orderId);
}
