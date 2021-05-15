package com.example.RitualSpft.BackEnd.repository;

import com.example.RitualSpft.BackEnd.models.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
    List<UserEntity>findByRole(String role);
}
