package com.example.tournament.model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class ProdIds {

    private Map<String, String> productIdMap;

    public ProdIds() {
        productIdMap = new HashMap<>();
        productIdMap.put("SmallHoodie", "price_1JmhYcBWLJtzxyapnrAYJAdh");
        productIdMap.put("MediumHoodie", "price_1Jv0lVBWLJtzxyapj0coTbhb");
        productIdMap.put("LargeHoodie", "price_1Jv0mQBWLJtzxyapPfq5H6vu");
        productIdMap.put("XLargeHoodie", "price_1Jv0mpBWLJtzxyapH1feP3mp");
        productIdMap.put("SmallSweats", "smallHoodieId");
        productIdMap.put("MediumSweats", "smallHoodieId");
        productIdMap.put("LargeSweats", "smallHoodieId");
        productIdMap.put("XLargeSweats", "smallHoodieId");
        productIdMap.put("SmallShirt", "smallHoodieId");
        productIdMap.put("MediumShirt", "smallHoodieId");
        productIdMap.put("LargeShirt", "smallHoodieId");
        productIdMap.put("XLargeShirt", "smallHoodieId");
        productIdMap.put("Mousepad", "smallHoodieId");
        productIdMap.put("TournamentTicket", "price_1Jv1VNBWLJtzxyapWJ4OvNDY");

    }

    public Map<String, String> getProductIdMap() {
        return productIdMap;
    }

    public ProdIds setProductIdMap(Map<String, String> productIdMap) {
        this.productIdMap = productIdMap;
        return this;
    }
}
