package com.Blanco.Portfolio.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    public int id;
    public String skillIco;
    public int percent;
}
