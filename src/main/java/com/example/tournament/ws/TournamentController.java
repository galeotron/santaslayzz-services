package com.example.tournament.ws;

import com.example.tournament.model.TournamentDB;
import com.example.tournament.repository.TournamentRepository;
import com.example.tournament.svc.TournamentService;
import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

//@RestController
//@RequestMapping(value = "/tournament")
//public class TournamentController {
//
//    TournamentService tournamentService;
//
//    @Autowired
//    public TournamentController(TournamentService tournamentService) {
//        this.tournamentService = tournamentService;
//    }
//
//    @GetMapping("tournaments")
//    public List<TournamentDB> getAllTournamentInfo(){
//        return this.tournamentService.getAllTournaments();
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String handleRegisterForm(@ModelAttribute("tournament")
//                                     TournamentDB tournamentDB, BindingResult bindingResult) throws SQLException {
//        if(bindingResult.hasErrors()) {
//            return "addTournament";
//
//        }
//        tournamentService.addTournament(tournamentDB);
//
//        return "redirect:/home";
//    }
//
//}

@RestController
@RequestMapping(value = "/tournament")
public class TournamentController {




    @Autowired
    private TournamentRepository tournamentRepository;

    @GetMapping("/tournaments")
    public List<TournamentDB> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    @PutMapping("/register/{id}")
    public ResponseEntity<TournamentDB> upsertTournament(@PathVariable(value = "id") long teamId, @RequestBody TournamentDB tournamentDBInfo) throws Exception {
          TournamentDB tournamentDB = tournamentRepository.findById(teamId).orElseThrow(() -> new Exception("Team with that Id not found"));
          tournamentDB.setDiscordName(tournamentDBInfo.getDiscordName());
          tournamentDB.setGame1Kills(tournamentDBInfo.getGame1Kills());
          tournamentDB.setGame1Placement(tournamentDBInfo.getGame1Placement());
          tournamentDB.setGame2Kills(tournamentDBInfo.getGame2Kills());
          tournamentDB.setGame2Placement(tournamentDBInfo.getGame2Placement());
          tournamentDB.setGame3Kills(tournamentDBInfo.getGame3Kills());
          tournamentDB.setGame3Placement(tournamentDBInfo.getGame3Placement());
          tournamentDB.setGame4Kills(tournamentDBInfo.getGame4Kills());
          tournamentDB.setGame4Placement(tournamentDBInfo.getGame4Placement());
          tournamentDB.setOfficialName1(tournamentDBInfo.getOfficialName1());
          tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName2());
          tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName3());
          tournamentDB.setOfficialName4(tournamentDBInfo.getOfficialName4());
          tournamentDB.setPlayerName1(tournamentDBInfo.getPlayerName1());
          tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName2());
          tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName3());
          tournamentDB.setPlayerName4(tournamentDBInfo.getPlayerName4());
          tournamentDB.setTeamName(tournamentDBInfo.getTeamName());

          final TournamentDB updatedTournament = tournamentRepository.save(tournamentDB);
          return ResponseEntity.ok(updatedTournament);

    }
}
