package com.Blanco.Portfolio.entity;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titleEdu;
    private String imgEdu;
    @Temporal(TemporalType.DATE)
    private Date dateInitEdu;
    @Temporal(TemporalType.DATE)
    private Date dateEndEdu;
    private String institutionEdu;
    @Lob
    private String descriptionEdu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleEdu() {
        return titleEdu;
    }

    public void setTitleEdu(String titleEdu) {
        this.titleEdu = titleEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    public Date getDateInitEdu() {
        return dateInitEdu;
    }

    public void setDateInitEdu(Date dateInitEdu) {
        this.dateInitEdu = dateInitEdu;
    }

    public Date getDateEndEdu() {
        return dateEndEdu;
    }

    public void setDateEndEdu(Date dateEndEdu) {
        this.dateEndEdu = dateEndEdu;
    }

    public String getInstitutionEdu() {
        return institutionEdu;
    }

    public void setInstitutionEdu(String institutionEdu) {
        this.institutionEdu = institutionEdu;
    }

    public String getDescriptionEdu() {
        return descriptionEdu;
    }

    public void setDescriptionEdu(String descriptionEdu) {
        this.descriptionEdu = descriptionEdu;
    }
}
