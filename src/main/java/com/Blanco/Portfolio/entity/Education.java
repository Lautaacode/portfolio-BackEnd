package com.Blanco.Portfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
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

    public Education(){

    }
}
