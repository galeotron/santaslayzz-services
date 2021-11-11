package com.example.tournament.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ItemInfo {
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("Price")
    private BigDecimal Price;
    @JsonProperty("PriceId")
    private String PriceId;
    @JsonProperty("SizeQuantity")
    private SizeQuantity sizeQuantity;

    public String getDescription() {
        return Description;
    }

    public ItemInfo setDescription(String description) {
        Description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return Price;
    }


    public String getPriceId() {
        return PriceId;
    }

    public ItemInfo setPriceId(String priceId) {
        PriceId = priceId;
        return this;
    }

    public SizeQuantity getSizeQuantity() {
        return sizeQuantity;
    }

    public ItemInfo setSizeQuantity(SizeQuantity sizeQuantity) {
        this.sizeQuantity = sizeQuantity;
        return this;
    }
}
