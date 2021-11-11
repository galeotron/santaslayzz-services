package com.example.tournament.model;


import com.fasterxml.jackson.annotation.JsonProperty;



public class Cart {
    @JsonProperty("Hoodie")
    private Hoodie hoodie;


    public Hoodie getHoodie() {
        return hoodie;
    }

    public Cart setHoodie(Hoodie hoodie) {
        this.hoodie = hoodie;
        return this;
    }
}
