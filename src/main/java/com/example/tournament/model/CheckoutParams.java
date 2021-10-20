package com.example.tournament.model;

import java.util.Currency;

public class CheckoutParams {
    private String Id;
    private String SuccessUrl;
    private Currency Currency;
    private String CancelUrl;
    private String[] PaymentMethodTypes;



    public CheckoutParams(String id, String successUrl, java.util.Currency currency, Enum MODE, String cancelUrl, String[] paymentMethodTypes) {
        Id = id;
        SuccessUrl = successUrl;
        Currency = currency;
        CancelUrl = cancelUrl;
        PaymentMethodTypes = paymentMethodTypes;
    }

    public String getId() {
        return Id;
    }

    public CheckoutParams setId(String id) {
        Id = id;
        return this;
    }

    public String getSuccessUrl() {
        return SuccessUrl;
    }

    public CheckoutParams setSuccessUrl(String successUrl) {
        SuccessUrl = successUrl;
        return this;
    }

    public java.util.Currency getCurrency() {
        return Currency;
    }

    public CheckoutParams setCurrency(java.util.Currency currency) {
        Currency = currency;
        return this;
    }

    public String getCancelUrl() {
        return CancelUrl;
    }

    public CheckoutParams setCancelUrl(String cancelUrl) {
        CancelUrl = cancelUrl;
        return this;
    }

    public String[] getPaymentMethodTypes() {
        return PaymentMethodTypes;
    }

    public CheckoutParams setPaymentMethodTypes(String[] paymentMethodTypes) {
        PaymentMethodTypes = paymentMethodTypes;
        return this;
    }
}
