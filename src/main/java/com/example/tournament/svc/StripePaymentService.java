package com.example.tournament.svc;

import com.example.tournament.model.CheckoutParams;

public interface StripePaymentService {

    CheckoutParams createCheckoutSession(CheckoutParams checkoutParams);
}
