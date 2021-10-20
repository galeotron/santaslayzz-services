package com.example.tournament.svc.impl;

import com.example.tournament.model.Profile;
import com.example.tournament.svc.ProfileService;
import com.example.tournament.svc.dao.ProfileDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

    private final ProfileDao profileDao;

    @Autowired
    public ProfileServiceImpl(ProfileDao profileDao) {this.profileDao = profileDao;}


    @Override
    public Profile getProfile(String id) {
        return profileDao.getProfile(id);
    }

    @Override
    public Profile upsertProfile(Profile profile) {
        profileDao.upsertProfile(profile);
        return profile;
    }
}
