package com.example.tournament.ws;


import com.example.tournament.model.CheckoutParams;
import com.example.tournament.svc.StripePaymentService;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value="/store")
public class StripePaymentController {

    @Value("${stripe.apiKeySecret}")
    private String API_SECRET_KEY;

//    private final StripePaymentService stripePaymentService;

//    @Autowired
//    public StripePaymentController(StripePaymentService stripePaymentService) {this.stripePaymentService = stripePaymentService;}
    public StripePaymentController() {}


    @PostMapping("/create-checkout-session")
    public void checkoutSession(
            HttpServletResponse response
    ) throws StripeException {
        Stripe.apiKey=API_SECRET_KEY;
        String YOUR_DOMAIN = "http://localhost:3000/checkout";
        SessionCreateParams params =
                SessionCreateParams.builder()
                        .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
                        .setMode(SessionCreateParams.Mode.PAYMENT)
                        .setSuccessUrl(YOUR_DOMAIN + "?success=true")
                        .setCancelUrl(YOUR_DOMAIN + "?canceled=true")
                        .addLineItem(
                                SessionCreateParams.LineItem.builder()
                                        .setQuantity(1L)
                                        // TODO: replace this with the `price` of the product you want to sell
                                        .setPrice("price_1JmhYcBWLJtzxyapnrAYJAdh")
                                        .build())
                        .build();
        Session session = Session.create(params);
        response.setHeader("location", session.getUrl());
        response.setStatus(302);
    }

}
