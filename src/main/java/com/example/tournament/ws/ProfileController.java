package com.example.tournament.ws;

import com.example.tournament.model.Profile;
import com.example.tournament.svc.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) { this.profileService = profileService;}


    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable String id) { return profileService.getProfile(id);}

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Profile upsertProfile(
            @PathVariable String id, @RequestBody Profile profile) {
        profile.setId(id);
        return profileService.upsertProfile(profile);
    }
}
