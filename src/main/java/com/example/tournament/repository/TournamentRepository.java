package com.example.tournament.repository;

import com.example.tournament.model.TournamentDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends JpaRepository<TournamentDB, Long> {


}
