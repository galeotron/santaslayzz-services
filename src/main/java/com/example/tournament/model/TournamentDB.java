package com.example.tournament.model;

import javax.persistence.*;

@Entity
public class TournamentDB {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column (name="id")
//    private long id;

    @Id
    @Column (name="teamName")
    private String teamName;

    @Column (name="discordName")
    private String discordName;

    @Column (name="playerName1")
    private String playerName1;

    @Column (name="officialName1")
    private String officialName1;

    @Column (name="playerName2")
    private String playerName2;

    @Column (name="officialName2")
    private String officialName2;

    @Column (name="playerName3")
    private String playerName3;

    @Column (name="officialName3")
    private String officialName3;

    @Column (name="playerName4")
    private String playerName4;

    @Column (name="officialName4")
    private String officialName4;

    @Column (name="game1Kills")
    private Integer game1Kills;

    @Column (name="game1Placement")
    private Integer game1Placement;

    @Column (name="game2Kills")
    private Integer game2Kills;

    @Column (name="game2Placement")
    private Integer game2Placement;

    @Column (name="game3Kills")
    private Integer game3Kills;

    @Column (name="game3Placement")
    private Integer game3Placement;

    @Column (name="game4Kills")
    private Integer game4Kills;

    @Column (name="game4Placement")
    private Integer game4Placement;

    @Column (name="passcode")
    private Integer passcode;


    public TournamentDB(Integer passcode, String teamName, String discordName, String playerName1, String officialName1, String playerName2, String officialName2, String playerName3, String officialName3, String playerName4, String officialName4, Integer game1Kills, Integer game1Placement, Integer game2Kills, Integer game2Placement, Integer game3Kills, Integer game3Placement, Integer game4Kills, Integer game4Placement) {
//        this.id = id;
        this.teamName = teamName;
        this.discordName = discordName;
        this.playerName1 = playerName1;
        this.officialName1 = officialName1;
        this.playerName2 = playerName2;
        this.officialName2 = officialName2;
        this.playerName3 = playerName3;
        this.officialName3 = officialName3;
        this.playerName4 = playerName4;
        this.officialName4 = officialName4;
        this.game1Kills = game1Kills;
        this.game1Placement = game1Placement;
        this.game2Kills = game2Kills;
        this.game2Placement = game2Placement;
        this.game3Kills = game3Kills;
        this.game3Placement = game3Placement;
        this.game4Kills = game4Kills;
        this.game4Placement = game4Placement;
        this.passcode = passcode;
    }

    public TournamentDB() {
    }

//    public long getId() {
//        return id;
//    }
//
//    public TournamentDB setId(long id) {
//        this.id = id;
//        return this;
//    }

    public String getTeamName() {
        return teamName;
    }

    public TournamentDB setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public String getDiscordName() {
        return discordName;
    }

    public TournamentDB setDiscordName(String discordName) {
        this.discordName = discordName;
        return this;
    }

    public String getPlayerName1() {
        return playerName1;
    }

    public TournamentDB setPlayerName1(String playerName1) {
        this.playerName1 = playerName1;
        return this;
    }

    public String getOfficialName1() {
        return officialName1;
    }

    public TournamentDB setOfficialName1(String officialName1) {
        this.officialName1 = officialName1;
        return this;
    }

    public String getPlayerName2() {
        return playerName2;
    }

    public TournamentDB setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;
        return this;
    }

    public String getOfficialName2() {
        return officialName2;
    }

    public TournamentDB setOfficialName2(String officialName2) {
        this.officialName2 = officialName2;
        return this;
    }

    public String getPlayerName3() {
        return playerName3;
    }

    public TournamentDB setPlayerName3(String playerName3) {
        this.playerName3 = playerName3;
        return this;
    }

    public String getOfficialName3() {
        return officialName3;
    }

    public TournamentDB setOfficialName3(String officialName3) {
        this.officialName3 = officialName3;
        return this;
    }

    public String getPlayerName4() {
        return playerName4;
    }

    public TournamentDB setPlayerName4(String playerName4) {
        this.playerName4 = playerName4;
        return this;
    }

    public String getOfficialName4() {
        return officialName4;
    }

    public TournamentDB setOfficialName4(String officialName4) {
        this.officialName4 = officialName4;
        return this;
    }

    public Integer getGame1Kills() {
        return game1Kills;
    }

    public TournamentDB setGame1Kills(Integer game1Kills) {
        this.game1Kills = game1Kills;
        return this;
    }

    public Integer getGame1Placement() {
        return game1Placement;
    }

    public TournamentDB setGame1Placement(Integer game1Placement) {
        this.game1Placement = game1Placement;
        return this;
    }

    public Integer getGame2Kills() {
        return game2Kills;
    }

    public TournamentDB setGame2Kills(Integer game2Kills) {
        this.game2Kills = game2Kills;
        return this;
    }

    public Integer getGame2Placement() {
        return game2Placement;
    }

    public TournamentDB setGame2Placement(Integer game2Placement) {
        this.game2Placement = game2Placement;
        return this;
    }

    public Integer getGame3Kills() {
        return game3Kills;
    }

    public TournamentDB setGame3Kills(Integer game3Kills) {
        this.game3Kills = game3Kills;
        return this;
    }

    public Integer getGame3Placement() {
        return game3Placement;
    }

    public TournamentDB setGame3Placement(Integer game3Placement) {
        this.game3Placement = game3Placement;
        return this;
    }

    public Integer getGame4Kills() {
        return game4Kills;
    }

    public TournamentDB setGame4Kills(Integer game4Kills) {
        this.game4Kills = game4Kills;
        return this;
    }

    public Integer getGame4Placement() {
        return game4Placement;
    }

    public TournamentDB setGame4Placement(Integer game4Placement) {
        this.game4Placement = game4Placement;
        return this;
    }

    public Integer getPasscode() {
        return passcode;
    }

    public TournamentDB setPasscode(Integer passcode) {
        this.passcode = passcode;
        return this;
    }

    @Override
    public String toString() {
        return "Team name: " + teamName;
    }
}
