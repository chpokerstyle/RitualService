package com.example.RitualSpft.BackEnd.models.entity;

import javax.persistence.*;

@Entity
@Table
public class UserEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String number;


    @ManyToOne
    RoleEntity roleEntity;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
