package com.example.tournament.ws;


import com.example.tournament.model.Cart;
import com.example.tournament.model.CheckoutParams;
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
@RequestMapping(value="/store")
public class StripePaymentController {

    @Value("${stripe.apiKeySecret}")
    private String API_SECRET_KEY;

//    private final StripePaymentService stripePaymentService;

//    @Autowired
//    public StripePaymentController(StripePaymentService stripePaymentService) {this.stripePaymentService = stripePaymentService;}
    public StripePaymentController() {}

    @CrossOrigin(origins = "*")
    @PostMapping("/create-checkout-session")
    public HashMap<String, String> checkoutSession(
            HttpServletResponse response, @RequestBody Cart cart
    ) throws StripeException /*JsonProcessingException*/ {
        Stripe.apiKey=API_SECRET_KEY;
        String YOUR_DOMAIN = "http://localhost:3000/checkout";
//        ObjectMapper mapper = new ObjectMapper();
//        String cartJson = mapper.writeValueAsString( cart );

        ObjectMapper mapper = new ObjectMapper();

// Convert POJO to Map
        Map<String, Object> map =
                mapper.convertValue(cart, new TypeReference<Map<String, Object>>() {});
        System.out.println(map);

        for(Map.Entry<String,Object> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }


        SessionCreateParams params =
                SessionCreateParams.builder()
                        .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
                        .setMode(SessionCreateParams.Mode.PAYMENT)
                        .setSuccessUrl(YOUR_DOMAIN + "?success=true")
                        .setCancelUrl(YOUR_DOMAIN + "?canceled=true")



//                        for (int i = 0; i < map.size(); i ++) {
//                            System.out.println(i);
//                            }

                            .addLineItem(

                                    SessionCreateParams.LineItem.builder()
                                            .setQuantity(Long.valueOf(cart.getHoodie().getItemInfo().getSizeQuantity().getSm()))
                                            .setPrice(cart.getHoodie().getItemInfo().getPriceId())
    //                                        .set
    //                                        .putExtraParam("size", "xl")
                                            .build())

//                            .addLineItem(
//                                    SessionCreateParams.LineItem.builder()
//                                            .setQuantity(Long.valueOf(cart.getHoodie().getItemInfo().getSizeQuantity().getLg()))
//                                            .setPrice(cart.getHoodie().getItemInfo().getPriceId())
//                                            .build())
                        .build();
        Session session = Session.create(params);
//        response.setHeader("location", session.getUrl());
//        response.setStatus(302);
        HashMap<String, String> result = new HashMap<>();
        result.put("url", session.getUrl() );
        return result;
    }

}
