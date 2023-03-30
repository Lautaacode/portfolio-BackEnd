package com.Blanco.Portfolio.controller;


import com.Blanco.Portfolio.entity.SocialMedia;
import com.Blanco.Portfolio.service.SSocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("socialmedia")
@CrossOrigin("*")
public class CSocialMedia {
    @Autowired
    private SSocialMedia sSocialMedia;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public SocialMedia createSocialMedia(@RequestBody SocialMedia socialMedia){
        SocialMedia socialMedia1 = sSocialMedia.createSocialMedia(socialMedia);
        return socialMedia1;
    }
    @GetMapping("/show")
    public List<SocialMedia> getSocialMedias(){
        return  sSocialMedia.getSocialMedias();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public SocialMedia updateSocialMedia(@RequestBody SocialMedia socialMedia, @PathVariable("id") long id){
        return sSocialMedia.updateSocialMedia(socialMedia,id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String deleteSocialMedia(@PathVariable("id") long id){
        sSocialMedia.deleteSocialMedia(id);
        return "La experiencia se elimino correctamente.";
    }
    @GetMapping("/show/{id}")
    public SocialMedia getSocialMedia(@PathVariable("id") long id){
        return sSocialMedia.getSocialMedia(id);
    }
}
