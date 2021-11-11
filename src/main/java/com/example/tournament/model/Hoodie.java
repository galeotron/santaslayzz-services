package com.example.tournament.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hoodie {
    @JsonProperty("ItemInfo")
    private ItemInfo itemInfo;

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public Hoodie setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
        return this;
    }
}
