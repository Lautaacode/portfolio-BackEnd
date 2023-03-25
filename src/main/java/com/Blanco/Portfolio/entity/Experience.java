package com.Blanco.Portfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titleExp;
    private String imgExp;
    @Temporal(TemporalType.DATE)
    private Date dateInitExp;
    @Temporal(TemporalType.DATE)
    private Date dateEndExp;
    private String institutionExp;
    @Lob
    private String descriptionExp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleExp() {
        return titleExp;
    }

    public void setTitleExp(String titleExp) {
        this.titleExp = titleExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

    public Date getDateInitExp() {
        return dateInitExp;
    }

    public void setDateInitExp(Date dateInitExp) {
        this.dateInitExp = dateInitExp;
    }

    public Date getDateEndExp() {
        return dateEndExp;
    }

    public void setDateEndExp(Date dateEndExp) {
        this.dateEndExp = dateEndExp;
    }

    public String getInstitutionExp() {
        return institutionExp;
    }

    public void setInstitutionExp(String institutionExp) {
        this.institutionExp = institutionExp;
    }

    public String getDescriptionExp() {
        return descriptionExp;
    }

    public void setDescriptionExp(String descriptionExp) {
        this.descriptionExp = descriptionExp;
    }
}
