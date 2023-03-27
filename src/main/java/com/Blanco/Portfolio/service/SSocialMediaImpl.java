package com.Blanco.Portfolio.service;


import com.Blanco.Portfolio.entity.SocialMedia;
import com.Blanco.Portfolio.repository.RSocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SSocialMediaImpl implements SSocialMedia {

    @Autowired
    private RSocialMedia rSocialMedia;
    @Override
    public SocialMedia createSocialMedia(SocialMedia socialMedia) {
        return rSocialMedia.save(socialMedia);
    }

    @Override
    public List<SocialMedia> getSocialMedias() {
        return (List<SocialMedia>) rSocialMedia.findAll();
    }

    @Override
    public SocialMedia getSocialMedia(long id) {
        return rSocialMedia.findById(id).get();
    }

    @Override
    public void deleteSocialMedia(long id) {
        rSocialMedia.deleteById(id);
    }

    @Override
    public SocialMedia updateSocialMedia(SocialMedia socialMedia, long id) {
        SocialMedia socialMedia1 = rSocialMedia.findById(id).get();
        socialMedia1.setSocialIco(socialMedia.getSocialIco());
        socialMedia1.setSocialLink(socialMedia.getSocialLink());
        return rSocialMedia.save(socialMedia1);
    }
}
