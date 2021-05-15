package com.example.RitualSpft.BackEnd.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class RoleEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String position;

    @OneToMany
    List<UserEntity> userEntityList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
