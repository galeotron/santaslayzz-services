package com.example.tournament.svc.dao;

import com.example.tournament.model.Profile;

public interface ProfileDao {
    Profile getProfile(String id);

    void upsertProfile(Profile profile);
}
