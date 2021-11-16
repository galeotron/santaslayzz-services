package com.example.tournament.model;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//public class Cart {
////    @JsonProperty("Hoodie")
////    private Hoodie hoodie;
//
//
////    public Hoodie getHoodie() {
////        return hoodie;
////    }
//
////    public Cart setHoodie(Hoodie hoodie) {
////        this.hoodie = hoodie;
////        return this;
////    }
//
////    @JsonProperty("Items")
////    public List<Item> items = null;
////
////    public List<Item> getItems() {
////        return items;
////    }
//}

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "Items"
//})
@Generated("jsonschema2pojo")
public class Cart {

    @JsonProperty("Items")
    public List<Item> items;


    public List<Item> getItems() {
        return items;
    }



}