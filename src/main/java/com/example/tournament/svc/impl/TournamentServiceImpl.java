package com.example.tournament.svc.impl;

import com.example.tournament.model.TournamentDB;
import com.example.tournament.repository.TournamentRepository;
import com.example.tournament.svc.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServiceImpl implements TournamentService {

    TournamentRepository tournamentRepository;

    @Autowired
    public TournamentServiceImpl(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    @Override
    public void addTournament(TournamentDB tournament) {

    }

    @Override
    public List<TournamentDB> getAllTournaments() {
        return null;
    }

    @Override
    public TournamentDB getTournamentByName(String tournamentName) {
        return null;
    }

    @Override
    public void updateTournamentDBInfo(String tournamentName) {

    }

    @Override
    public void deleteTournamentDB(String tournamentName) {

    }
}
