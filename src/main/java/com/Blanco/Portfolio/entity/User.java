package com.Blanco.Portfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastname;
    private String title;
    @Lob
    private String aboutMe;

    private String profileImg;
    private String bannerImg;
    private String jobImg;
    private String studyImg;

    public User(){

    }

    public User(int id, String name, String lastname, String title, String aboutMe, String profileImg, String bannerImg, String jobImg, String studyImg) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        this.aboutMe = aboutMe;
        this.profileImg = profileImg;
        this.bannerImg = bannerImg;
        this.jobImg = jobImg;
        this.studyImg = studyImg;
    }
}
