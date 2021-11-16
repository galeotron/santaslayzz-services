package com.example.tournament.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "Name",
//        "Quantity",
//        "ProdId"
//})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("Name")
    public String name;
    @JsonProperty("Quantity")
    public Long quantity;
    @JsonProperty("ProdId")
    public String prodId;

    public String getName() {
        return name;
    }

    public Long getQuantity() {
        System.out.println(quantity);
        return quantity;
    }

    public String getProdId() {
        return prodId;
    }
}