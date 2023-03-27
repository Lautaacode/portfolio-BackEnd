package com.Blanco.Portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "title")
    private String title;
    @Column(name = "about_me")
    @Lob
    private String aboutMe;
    @Column(name = "profile_img")
    private String profileImg;
    @Column(name = "banner_img")
    private String bannerImg;
    @Column(name = "job_img")
    private String jobImg;
    @Column(name = "job_link")
    @Lob
    private String jobLink;
    @Column(name = "study_img")
    private String studyImg;
    @Column(name = "study_link")
    @Lob
    private String studyLink;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public String getJobImg() {
        return jobImg;
    }

    public void setJobImg(String jobImg) {
        this.jobImg = jobImg;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

    public String getStudyImg() {
        return studyImg;
    }

    public void setStudyImg(String studyImg) {
        this.studyImg = studyImg;
    }

    public String getStudyLink() {
        return studyLink;
    }

    public void setStudyLink(String studyLink) {
        this.studyLink = studyLink;
    }
}
