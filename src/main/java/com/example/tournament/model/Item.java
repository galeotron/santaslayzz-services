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
    @JsonProperty("DiscordName")
    public String discordName;
    @JsonProperty("OfficialName1")
    public Long officialName1;
    @JsonProperty("OfficialName2")
    public String officialName2;
    @JsonProperty("OfficialName3")
    public Long officialName3;
    @JsonProperty("OfficialName4")
    public String officialName4;
    @JsonProperty("PlayerName1")
    public Long playerName1;
    @JsonProperty("PlayerName2")
    public String playerName2;
    @JsonProperty("PlayerName3")
    public Long playerName3;
    @JsonProperty("PlayerName4")
    public String playerName4;
    @JsonProperty("TeamName")
    public String teamName;

    public String getName() {
        return name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public String getProdId() {
        return prodId;
    }

    public String getDiscordName() {
        return discordName;
    }

    public Long getOfficialName1() {
        return officialName1;
    }

    public String getOfficialName2() {
        return officialName2;
    }

    public Long getOfficialName3() {
        return officialName3;
    }

    public String getOfficialName4() {
        return officialName4;
    }

    public Long getPlayerName1() {
        return playerName1;
    }

    public String getPlayerName2() {
        return playerName2;
    }

    public Long getPlayerName3() {
        return playerName3;
    }

    public String getPlayerName4() {
        return playerName4;
    }

    public String getTeamName() {
        return teamName;
    }
}

