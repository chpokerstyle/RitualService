package com.example.RitualSpft.BackEnd.models.mapped;

import com.example.RitualSpft.BackEnd.models.dto.UserDto;
import com.example.RitualSpft.BackEnd.models.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity toEntity(UserDto userDto);
    UserDto toDto(UserEntity userEntity);
}
