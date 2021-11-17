package com.example.tournament.svc;


import com.example.tournament.model.TournamentDB;

import java.util.List;

public interface TournamentService {

    void addTournament(TournamentDB tournament);
    List<TournamentDB> getAllTournaments();
    TournamentDB getTournamentByName(String tournamentName);
    void updateTournamentDBInfo (String tournamentName);
    void deleteTournamentDB (String tournamentName);
}
