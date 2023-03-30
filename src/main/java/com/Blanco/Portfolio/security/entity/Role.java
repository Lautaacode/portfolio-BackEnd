package com.Blanco.Portfolio.security.entity;

import com.Blanco.Portfolio.security.enums.RoleName;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleName roleName;

    //Contrucctores
    public Role() {
    }

    public Role(@NotNull RoleName roleName) {
        this.roleName = roleName;
    }

    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }
}
