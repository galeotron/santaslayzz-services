package com.example.tournament.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tournament {
    @JsonProperty("TeamName")
    public String teamName;
    @JsonProperty("DiscordName")
    public String discordName;
    @JsonProperty("NoOfPlayers")
    public Integer noOfPlayers;
    @JsonProperty("PlayerName1")
    public String playerName1;
    @JsonProperty("OfficialName1")
    public String officialName1;
    @JsonProperty("PlayerName2")
    public String playerName2;
    @JsonProperty("OfficialName2")
    public String officialName2;
    @JsonProperty("PlayerName3")
    public String playerName3;
    @JsonProperty("OfficialName3")
    public String officialName3;
    @JsonProperty("PlayerName4")
    public String playerName4;
    @JsonProperty("OfficialName4")
    public String officialName4;
    @JsonProperty("Game1Kills")
    public Integer game1Kills;
    @JsonProperty("Game1Placement")
    public Integer game1Placement;
    @JsonProperty("Game2Kills")
    public Integer game2Kills;
    @JsonProperty("Game2Placement")
    public Integer game2Placement;
    @JsonProperty("Game3Kills")
    public Integer game3Kills;
    @JsonProperty("Game3Placement")
    public Integer game3Placement;
    @JsonProperty("Game4Kills")
    public Integer game4Kills;
    @JsonProperty("Game4Placement")
    public Integer game4Placement;
    @JsonProperty("TournamentName")
    public Integer tournamentName;

    public String getTeamName() {
        return teamName;
    }

    public Tournament setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public String getDiscordName() {
        return discordName;
    }

    public Tournament setDiscordName(String discordName) {
        this.discordName = discordName;
        return this;
    }

    public Integer getNoOfPlayers() {
        return noOfPlayers;
    }

    public Tournament setNoOfPlayers(Integer noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
        return this;
    }

    public String getPlayerName1() {
        return playerName1;
    }

    public Tournament setPlayerName1(String playerName1) {
        this.playerName1 = playerName1;
        return this;
    }

    public String getOfficialName1() {
        return officialName1;
    }

    public Tournament setOfficialName1(String officialName1) {
        this.officialName1 = officialName1;
        return this;
    }

    public String getPlayerName2() {
        return playerName2;
    }

    public Tournament setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;
        return this;
    }

    public String getOfficialName2() {
        return officialName2;
    }

    public Tournament setOfficialName2(String officialName2) {
        this.officialName2 = officialName2;
        return this;
    }

    public String getPlayerName3() {
        return playerName3;
    }

    public Tournament setPlayerName3(String playerName3) {
        this.playerName3 = playerName3;
        return this;
    }

    public String getOfficialName3() {
        return officialName3;
    }

    public Tournament setOfficialName3(String officialName3) {
        this.officialName3 = officialName3;
        return this;
    }

    public String getPlayerName4() {
        return playerName4;
    }

    public Tournament setPlayerName4(String playerName4) {
        this.playerName4 = playerName4;
        return this;
    }

    public String getOfficialName4() {
        return officialName4;
    }

    public Tournament setOfficialName4(String officialName4) {
        this.officialName4 = officialName4;
        return this;
    }

    public Integer getGame1Kills() {
        return game1Kills;
    }

    public Tournament setGame1Kills(Integer game1Kills) {
        this.game1Kills = game1Kills;
        return this;
    }

    public Integer getGame1Placement() {
        return game1Placement;
    }

    public Tournament setGame1Placement(Integer game1Placement) {
        this.game1Placement = game1Placement;
        return this;
    }

    public Integer getGame2Kills() {
        return game2Kills;
    }

    public Tournament setGame2Kills(Integer game2Kills) {
        this.game2Kills = game2Kills;
        return this;
    }

    public Integer getGame2Placement() {
        return game2Placement;
    }

    public Tournament setGame2Placement(Integer game2Placement) {
        this.game2Placement = game2Placement;
        return this;
    }

    public Integer getGame3Kills() {
        return game3Kills;
    }

    public Tournament setGame3Kills(Integer game3Kills) {
        this.game3Kills = game3Kills;
        return this;
    }

    public Integer getGame3Placement() {
        return game3Placement;
    }

    public Tournament setGame3Placement(Integer game3Placement) {
        this.game3Placement = game3Placement;
        return this;
    }

    public Integer getGame4Kills() {
        return game4Kills;
    }

    public Tournament setGame4Kills(Integer game4Kills) {
        this.game4Kills = game4Kills;
        return this;
    }

    public Integer getGame4Placement() {
        return game4Placement;
    }

    public Tournament setGame4Placement(Integer game4Placement) {
        this.game4Placement = game4Placement;
        return this;
    }

    public Integer getTournamentName() {
        return tournamentName;
    }

    public Tournament setTournamentName(Integer tournamentName) {
        this.tournamentName = tournamentName;
        return this;
    }
}
