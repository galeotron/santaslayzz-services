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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

// @RestController
// @RequestMapping(value = "/tournament")
// public class TournamentController {
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
//                                     TournamentDB tournamentDB, BindingResult bindingResult)
// throws SQLException {
//        if(bindingResult.hasErrors()) {
//            return "addTournament";
//
//        }
//        tournamentService.addTournament(tournamentDB);
//
//        return "redirect:/home";
//    }
//
// }
@CrossOrigin
@RestController
@RequestMapping(value = "/tournament")
public class TournamentController {

  @Autowired private TournamentRepository tournamentRepository;

  @CrossOrigin(origins = "*")
  @GetMapping("/tournamentData")
  public List<TournamentDB> getAllTournaments() {
    return tournamentRepository.findAll();
  }

  @CrossOrigin(origins = "*")
  @PostMapping("/posting")
  public TournamentDB createTournament(@RequestBody TournamentDB tournamentDB) {
    return tournamentRepository.save(tournamentDB);
  }

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @PutMapping("/register/{teamName}")
  public ResponseEntity<TournamentDB> upsertTeamInfo(
      @PathVariable(value = "teamName") String teamName, @RequestBody TournamentDB tournamentDBInfo)
      /*throws Exception*/ {
//    TournamentDB tournamentDB = tournamentRepository.getById(teamName);


//    Runs if team has already registered at least one player
    if (tournamentRepository.existsById(tournamentDBInfo.getTeamName())) {
      TournamentDB tournamentDB = tournamentRepository.getById(teamName);
      tournamentDB.setTeamName(tournamentDBInfo.getTeamName());
      tournamentDB.setDiscordName(tournamentDBInfo.getDiscordName());



//      Provided one name
      if (tournamentDBInfo.getOfficialName2() == null) {
        if (tournamentRepository.getById(teamName).getOfficialName1() == null) {
          tournamentDB.setOfficialName1(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName1(tournamentDBInfo.getPlayerName1());
        }
        else if (tournamentRepository.getById(teamName).getOfficialName2() == null) {
          tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName1());
        }
        else if (tournamentRepository.getById(teamName).getOfficialName3() == null) {
          tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName1());
        }
        else if (tournamentRepository.getById(teamName).getOfficialName4() == null) {
          tournamentDB.setOfficialName4(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName4(tournamentDBInfo.getPlayerName1());
        }
        else {
          System.out.println("Too many players 1");
        }


      }
//      provided two names
      else if (tournamentDBInfo.getOfficialName3() == null) {
        if (tournamentRepository.getById(teamName).getOfficialName1() == null) {
          tournamentDB.setOfficialName1(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName1(tournamentDBInfo.getPlayerName1());
          tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName2());
          tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName2());
        }
        else if (tournamentRepository.getById(teamName).getOfficialName2() == null) {
          tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName1());
          tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName2());
          tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName2());
        }
        else if (tournamentRepository.getById(teamName).getOfficialName3() == null) {
          tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName1());
          tournamentDB.setOfficialName4(tournamentDBInfo.getOfficialName2());
          tournamentDB.setPlayerName4(tournamentDBInfo.getPlayerName2());
        }
        else {
          System.out.println("Too many players 2");
        }
      }

//      provided 3 names
      else if (tournamentDBInfo.getOfficialName4() == null) {
        if (tournamentRepository.getById(teamName).getOfficialName1() == null) {
          tournamentDB.setOfficialName1(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName1(tournamentDBInfo.getPlayerName1());
          tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName2());
          tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName2());
          tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName3());
          tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName3());
        }
        else if (tournamentRepository.getById(teamName).getOfficialName2() == null) {
          tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName1());
          tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName2());
          tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName2());
          tournamentDB.setOfficialName4(tournamentDBInfo.getOfficialName3());
          tournamentDB.setPlayerName4(tournamentDBInfo.getPlayerName3());
        }
        else {
          System.out.println("Too many players 3");
        }
      }

//      provided 4 names
      else {
        if (tournamentRepository.getById(teamName).getOfficialName1() == null) {
          tournamentDB.setOfficialName1(tournamentDBInfo.getOfficialName1());
          tournamentDB.setPlayerName1(tournamentDBInfo.getPlayerName1());
          tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName2());
          tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName2());
          tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName3());
          tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName3());
          tournamentDB.setOfficialName4(tournamentDBInfo.getOfficialName4());
          tournamentDB.setPlayerName4(tournamentDBInfo.getPlayerName4());
        }
        else {
          System.out.println("Too many players 4");
        }

      }



//      tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName2());
//      tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName3());
//      tournamentDB.setOfficialName4(tournamentDBInfo.getOfficialName4());
//      tournamentDB.setPlayerName1(tournamentDBInfo.getPlayerName1());
//      tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName2());
//      tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName3());
//      tournamentDB.setPlayerName4(tournamentDBInfo.getPlayerName4());
      final TournamentDB updatedTournament = tournamentRepository.save(tournamentDB);
      return ResponseEntity.ok(updatedTournament);
    }
    else {
//      generate and set passcode
      Random random = new Random();
      int code = random.nextInt(10000);
      tournamentDBInfo.setPasscode(code);

      TournamentDB updatedTournament = tournamentRepository.save(tournamentDBInfo);
      return ResponseEntity.ok(updatedTournament);
    }



//    TournamentDB tournamentDB =
//        tournamentRepository.getById(
//            teamName); /*.orElseThrow(() -> new Exception("Team with that Id not found"));*/
//    tournamentDB.setDiscordName(tournamentDBInfo.getDiscordName());
//    tournamentDB.setGame1Kills(tournamentDBInfo.getGame1Kills());
//    tournamentDB.setGame1Placement(tournamentDBInfo.getGame1Placement());
//    tournamentDB.setGame2Kills(tournamentDBInfo.getGame2Kills());
//    tournamentDB.setGame2Placement(tournamentDBInfo.getGame2Placement());
//    tournamentDB.setGame3Kills(tournamentDBInfo.getGame3Kills());
//    tournamentDB.setGame3Placement(tournamentDBInfo.getGame3Placement());
//    tournamentDB.setGame4Kills(tournamentDBInfo.getGame4Kills());
//    tournamentDB.setGame4Placement(tournamentDBInfo.getGame4Placement());
//    tournamentDB.setOfficialName1(tournamentDBInfo.getOfficialName1());
//    tournamentDB.setOfficialName2(tournamentDBInfo.getOfficialName2());
//    tournamentDB.setOfficialName3(tournamentDBInfo.getOfficialName3());
//    tournamentDB.setOfficialName4(tournamentDBInfo.getOfficialName4());
//    tournamentDB.setPlayerName1(tournamentDBInfo.getPlayerName1());
//    tournamentDB.setPlayerName2(tournamentDBInfo.getPlayerName2());
//    tournamentDB.setPlayerName3(tournamentDBInfo.getPlayerName3());
//    tournamentDB.setPlayerName4(tournamentDBInfo.getPlayerName4());
//    tournamentDB.setTeamName(tournamentDBInfo.getTeamName());

//    final TournamentDB updatedTournament = tournamentRepository.save(tournamentDB);
//    return ResponseEntity.ok(updatedTournament);
  }

  @PutMapping("/reporting/{teamName}")
  public ResponseEntity<TournamentDB> uploadScores(
      @PathVariable(value = "teamName") String teamName, @RequestBody TournamentDB tournamentDBInfo) {


        //      runs if correct passcode is entered
    if (Objects.equals(tournamentRepository.getById(teamName).getPasscode(), tournamentDBInfo.getPasscode())) {
      TournamentDB tournamentDB = tournamentRepository.getById(teamName);
      tournamentDB.setGame1Kills(tournamentDBInfo.getGame1Kills());
      tournamentDB.setGame1Placement(tournamentDBInfo.getGame1Placement());
      tournamentDB.setGame2Kills(tournamentDBInfo.getGame2Kills());
      tournamentDB.setGame2Placement(tournamentDBInfo.getGame2Placement());
      tournamentDB.setGame3Kills(tournamentDBInfo.getGame3Kills());
      tournamentDB.setGame3Placement(tournamentDBInfo.getGame3Placement());
      tournamentDB.setGame4Kills(tournamentDBInfo.getGame4Kills());
      tournamentDB.setGame4Placement(tournamentDBInfo.getGame4Placement());

      TournamentDB updatedTournament = tournamentRepository.save(tournamentDB);
      return ResponseEntity.ok(updatedTournament);
    }
    else {
//      TournamentDB updatedTournament = tournamentRepository.save(tournamentDBInfo);
      System.out.println("Incorrect code");
      return ResponseEntity.ok(tournamentDBInfo);
    }
  }

  @DeleteMapping("/admin/delete")
  public void deleteTournamentInfo() {
        tournamentRepository.deleteAll();
  }
}

