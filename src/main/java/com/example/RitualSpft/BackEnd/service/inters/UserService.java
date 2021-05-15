package com.example.RitualSpft.BackEnd.service.inters;

import com.example.RitualSpft.BackEnd.models.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto create(UserDto userDto);
    UserDto edit(UserDto userDto);
    void delete(Long id);
    List<UserDto>getAll();
    List<UserDto> findByRole(String role);
    List<UserDto> findById(Long id);
    UserDto findByNumber(String number);
}
