package com.Blanco.Portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "socialmedia")
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "socialico")
    private String socialIco;

    @Column(name = "sociallink")
    @Lob
    private String socialLink;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSocialIco() {
        return socialIco;
    }

    public void setSocialIco(String socialIco) {
        this.socialIco = socialIco;
    }

    public String getSocialLink() {
        return socialLink;
    }

    public void setSocialLink(String socialLink) {
        this.socialLink = socialLink;
    }
}
