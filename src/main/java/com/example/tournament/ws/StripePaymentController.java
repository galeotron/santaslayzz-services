package com.example.tournament.ws;

import com.example.tournament.model.Cart;
import com.example.tournament.model.CheckoutParams;
import com.example.tournament.model.ProdIds;
import com.example.tournament.svc.StripePaymentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/store")
public class StripePaymentController {

  @Value("${stripe.apiKeySecret}")
  private String API_SECRET_KEY;

  //    private final StripePaymentService stripePaymentService;

  //    @Autowired
  //    public StripePaymentController(StripePaymentService stripePaymentService)
  // {this.stripePaymentService = stripePaymentService;}
  public StripePaymentController() {}

  @CrossOrigin(origins = "*")
  @PostMapping("/create-checkout-session")
  public HashMap<String, String> checkoutSession(
      HttpServletResponse response, @RequestBody Cart cart)
      throws StripeException /*JsonProcessingException*/ {
    Stripe.apiKey = API_SECRET_KEY;
    String YOUR_DOMAIN = "http://localhost:3000/checkout";

    HashMap<String, Long> itemsToBuy = new HashMap<String, Long>();

    //        cart.items.stream().filter(i -> i.quantity == 0).forEach(System.out::println);
    cart.getItems().stream()
        .filter(i -> i.quantity != 0)
        .forEach(i -> itemsToBuy.put(i.name, i.quantity) /*i.getQuantity()*/);
    //        cart.getItems().stream().filter(i -> i.name == "SmallHoodie").forEach(i ->
    // System.out.println("yep"));
    //        System.out.println(itemsToBuy);

    //        cart.getItems().stream().filter(i -> i.quantity != 0).forEach(i ->
    // System.out.println(i.name + i.quantity +"Hello"));
    //        cart.getItems().stream().filter(i -> i.name.equals( "SmallHoodie")).forEach(i ->
    // System.out.println(itemsToBuy.get(i.name)));

    ProdIds prodIds = new ProdIds();
    //        System.out.println(prodIds.getProductIdMap());




    SessionCreateParams.Builder builder =
        SessionCreateParams.builder()
            .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
            .setMode(SessionCreateParams.Mode.PAYMENT)
            .setSuccessUrl(YOUR_DOMAIN + "?success=true")
            .setCancelUrl(YOUR_DOMAIN + "?canceled=true");

    for (String key : itemsToBuy.keySet()) {

      builder.addLineItem(
          SessionCreateParams.LineItem.builder()
              .setQuantity(itemsToBuy.get(key))
              .setPrice(prodIds.getProductIdMap().get(key))
              .build());
    }
    SessionCreateParams params = builder.build();
    Session session = Session.create(params);
    //        response.setHeader("location", session.getUrl());
    //        response.setStatus(302);
    HashMap<String, String> result = new HashMap<>();
    result.put("url", session.getUrl());
    return result;
  }
}
