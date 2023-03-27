package com.Blanco.Portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "skill_ico")
    private String skillIco;
    @Column(name = "percent")
    private int percent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillIco() {
        return skillIco;
    }

    public void setSkillIco(String skillIco) {
        this.skillIco = skillIco;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
