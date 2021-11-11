package com.example.tournament.model;

import com.fasterxml.jackson.annotation.JsonProperty;



public class SizeQuantity {
    @JsonProperty("sm")
    private Integer sm;
    @JsonProperty("md")
    private Integer md;
    @JsonProperty("lg")
    private Integer lg;
    @JsonProperty("xl")
    private Integer xl;

    public Integer getSm() {
        return sm;
    }

    public SizeQuantity setSm(Integer sm) {
        this.sm = sm;
        return this;
    }

    public Integer getMd() {
        return md;
    }

    public SizeQuantity setMd(Integer md) {
        this.md = md;
        return this;
    }

    public Integer getLg() {
        return lg;
    }

    public SizeQuantity setLg(Integer lg) {
        this.lg = lg;
        return this;
    }

    public Integer getXl() {
        return xl;
    }

    public SizeQuantity setXl(Integer xl) {
        this.xl = xl;
        return this;
    }
}
