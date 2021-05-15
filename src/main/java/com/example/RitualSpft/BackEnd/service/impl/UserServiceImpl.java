package com.example.RitualSpft.BackEnd.service.impl;

import com.example.RitualSpft.BackEnd.models.dto.UserDto;
import com.example.RitualSpft.BackEnd.models.entity.UserEntity;
import com.example.RitualSpft.BackEnd.models.mapped.UserMapper;
import com.example.RitualSpft.BackEnd.repository.UserRepo;
import com.example.RitualSpft.BackEnd.service.inters.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    final UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDto create(UserDto userDto) {
        UserEntity save = repo.save(UserMapper.INSTANCE.toEntity(userDto));
        return UserMapper.INSTANCE.toDto(save);
    }

    @Override
    public UserDto edit(UserDto userDto) {
        UserEntity edit = repo.save(UserMapper.INSTANCE.toEntity(userDto));
        return UserMapper.INSTANCE.toDto(edit);
    }

    @Override
    public void delete(Long id) {
    repo.deleteById(id);
    }

    @Override
    public List<UserDto> getAll() {
        return repo.findAll()
                .stream()
                .map(UserMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDto> findByRole(String role) {

        return repo.findByRole(role)
                .stream()
                .map(UserMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDto> findById(Long id) {
        return repo.findById(id)
                .stream()
                .map(UserMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto findByNumber(String number) {
        return null;
    }
}
