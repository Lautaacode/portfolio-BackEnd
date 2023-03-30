package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.Media;
import com.Blanco.Portfolio.service.SMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("media")
@CrossOrigin(origins = "*")
public class CMedia {
    @Autowired
    private SMedia sMedia;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public Media createMedia(@RequestBody Media media){
        Media media1 = sMedia.createMedia(media);
        return media1;
    }
    @GetMapping("/show")
    public List<Media> getMedia(){
        return  sMedia.getMedias();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public Media updateMedia(@RequestBody Media media, @PathVariable("id") long id){
        return sMedia.updateMedia(media,id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String deleteMedia(@PathVariable("id") long id){
        sMedia.deleteMedia(id);
        return "La media se elimino correctamente.";
    }
    @GetMapping("/show/{id}")
    public Media getMedia(@PathVariable("id") long id){
        return sMedia.getMedia(id);
    }
}
