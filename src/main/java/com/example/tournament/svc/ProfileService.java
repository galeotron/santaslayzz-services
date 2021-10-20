package com.example.tournament.svc;

import com.example.tournament.model.Profile;

public interface ProfileService {
    Profile getProfile(String id);


    Profile upsertProfile(Profile profile);
}
