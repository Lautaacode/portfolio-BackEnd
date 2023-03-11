package com.Blanco.Portfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titleExp;
    private String imgExp;
    @Temporal(TemporalType.DATE)
    private Date dateInitExp;
    @Temporal(TemporalType.DATE)
    private Date dateEndExp;
    private String institutionExp;
    @Lob
    private String descriptionExp;

    public Experience(){

    }

    public Experience(int id, String titleExp, String imgExp, Date dateInitExp, Date dateEndExp, String institutionExp, String descriptionExp) {
        this.id = id;
        this.titleExp = titleExp;
        this.imgExp = imgExp;
        this.dateInitExp = dateInitExp;
        this.dateEndExp = dateEndExp;
        this.institutionExp = institutionExp;
        this.descriptionExp = descriptionExp;
    }
}
