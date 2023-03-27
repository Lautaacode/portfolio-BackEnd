package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Experience;
import com.Blanco.Portfolio.entity.Media;
import com.Blanco.Portfolio.repository.RMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SMediaImpl  implements SMedia{

    @Autowired
    private RMedia rMedia;
    @Override
    public Media createMedia(Media media) {
        return rMedia.save(media);
    }

    @Override
    public List<Media> getMedias() {
        return (List<Media>) rMedia.findAll();
    }

    @Override
    public Media getMedia(long id) {
        return rMedia.findById(id).get();
    }

    @Override
    public void deleteMedia(long id) {
        rMedia.deleteById(id);
    }

    @Override
    public Media updateMedia(Media media, long id) {
        Media media1 = rMedia.findById(id).get();
        media1.setLogo(media.getLogo());
        media1.setBackground(media.getBackground());
        return rMedia.save(media1);
    }
}
