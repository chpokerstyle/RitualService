package com.example.RitualSpft.BackEnd.repository;

import com.example.RitualSpft.BackEnd.models.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<RoleEntity, Long> {
}
