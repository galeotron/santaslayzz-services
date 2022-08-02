package com.example.tournament.ws;

import com.example.tournament.model.*;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;


@RestController
@RequestMapping(value = "/store")
public class StripePaymentController {

  @Value("${stripe.apiKeySecret}")
  private String API_SECRET_KEY;


  public StripePaymentController() {}

  @CrossOrigin(origins = "*")
  @PostMapping("/create-checkout-session")
  public HashMap<String, String> checkoutSession(
      HttpServletResponse response, @RequestBody Cart cart)
      throws StripeException /*JsonProcessingException*/ {
    Stripe.apiKey = API_SECRET_KEY;
    String YOUR_DOMAIN = "http://localhost:3000/checkout";



    HashMap<String, Long> itemsToBuy = new HashMap<String, Long>();


    cart.getItems().stream()
        .filter(i -> i.quantity != 0)
        .forEach(i -> itemsToBuy.put(i.name, i.quantity) /*i.getQuantity()*/);


    ProdIds prodIds = new ProdIds();


    SessionCreateParams.Builder builder =
        SessionCreateParams.builder()
            .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
            .setMode(SessionCreateParams.Mode.PAYMENT)
            .setAutomaticTax(SessionCreateParams.AutomaticTax.builder().build())
            .setSuccessUrl("http://localhost:3000/checkout/success")
            .setCancelUrl("http://localhost:3000/checkout/failed");

    for (String key : itemsToBuy.keySet()) {

      builder.addLineItem(
          SessionCreateParams.LineItem.builder()
              .setQuantity(itemsToBuy.get(key))
              .setPrice(prodIds.getProductIdMap().get(key))
              .build());
    }
    SessionCreateParams params = builder.build();
    Session session = Session.create(params);

    HashMap<String, String> result = new HashMap<>();
    result.put("url", session.getUrl());
    return result;
  }
}
