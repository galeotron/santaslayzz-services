package com.example.tournament.svc.impl;

import com.example.tournament.model.CheckoutParams;
import com.example.tournament.svc.StripePaymentService;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;


public class StripePaymentServiceImpl implements StripePaymentService {

    @Value("${stripe.apiKeySecret}")
    private String API_SECRET_KEY;


    @Override
    public CheckoutParams createCheckoutSession(CheckoutParams checkoutParams) {



        return null;
    }
}
