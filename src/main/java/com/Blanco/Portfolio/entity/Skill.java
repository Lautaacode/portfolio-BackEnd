package com.Blanco.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String skillIco;
    private int percent;

    public Skill(){

    }

    public Skill(int id, String imgIco, int percent) {
        this.id = id;
        this.skillIco = skillIco;
        this.percent = percent;
    }
}
