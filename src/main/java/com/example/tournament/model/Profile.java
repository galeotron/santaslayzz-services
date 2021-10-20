package com.example.tournament.model;

public class Profile {
  private String Id;
  private String Username;
  private String ActId;
  private String TeamName;
  private String TeamId;
  private boolean paid;

  public Profile() {}

  public Profile(
      String id, String username, String actId, String teamName, String teamId, boolean paid) {
    Id = id;
    Username = username;
    ActId = actId;
    TeamName = teamName;
    TeamId = teamId;
    this.paid = paid;
  }

  public String getId() {
    return Id;
  }

  public Profile setId(String id) {
    Id = id;
    return this;
  }

  public String getUsername() {
    return Username;
  }

  public Profile setUsername(String username) {
    Username = username;
    return this;
  }

  public String getActId() {
    return ActId;
  }

  public Profile setActId(String actId) {
    ActId = actId;
    return this;
  }

  public String getTeamName() {
    return TeamName;
  }

  public Profile setTeamName(String teamName) {
    TeamName = teamName;
    return this;
  }

  public String getTeamId() {
    return TeamId;
  }

  public Profile setTeamId(String teamId) {
    TeamId = teamId;
    return this;
  }

  public boolean isPaid() {
    return paid;
  }

  public Profile setPaid(boolean paid) {
    this.paid = paid;
    return this;
  }
}
