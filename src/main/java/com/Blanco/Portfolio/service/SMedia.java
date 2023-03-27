package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Media;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SMedia {
    public Media createMedia(Media media);

    public List<Media> getMedias();

    public Media getMedia(long id);

    public void deleteMedia(long id);

    public Media updateMedia(Media Media, long id);
}
