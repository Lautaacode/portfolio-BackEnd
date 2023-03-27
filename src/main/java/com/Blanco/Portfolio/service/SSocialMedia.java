package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.SocialMedia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SSocialMedia {
    public SocialMedia createSocialMedia(SocialMedia socialMedia);

    public List<SocialMedia> getSocialMedias();

    public SocialMedia getSocialMedia(long id);

    public void deleteSocialMedia(long id);

    public SocialMedia updateSocialMedia(SocialMedia socialMedia, long id);
}
