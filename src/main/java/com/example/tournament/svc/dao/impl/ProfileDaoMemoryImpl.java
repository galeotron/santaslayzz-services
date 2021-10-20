package com.example.tournament.svc.dao.impl;

import com.example.tournament.model.Profile;
import com.example.tournament.svc.dao.ProfileDao;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProfileDaoMemoryImpl implements ProfileDao {

  private Map<String, Profile> profileMap;

  public ProfileDaoMemoryImpl() {
    profileMap = new HashMap<>();
    profileMap.put(
        "1",
        new Profile()
            .setId("1")
            .setActId("1")
            .setPaid(true)
            .setTeamId("1")
            .setTeamName("balls")
            .setUsername("poop"));
  }

  @Override
  public Profile getProfile(String id) {
    return profileMap.get(id);
  }

  @Override
  public void upsertProfile(Profile profile) {
    profileMap.put(profile.getId(), profile);
  }
}
