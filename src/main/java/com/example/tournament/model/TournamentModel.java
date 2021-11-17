package com.example.tournament.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TournamentModel {

    @JsonProperty("Tournament")
    public List<Tournament> tournament = null;

    public List<Tournament> getTournament() {

        return tournament;
    }

    public TournamentModel setTournament(List<Tournament> tournament) {
        this.tournament = tournament;
        return this;
    }
}
