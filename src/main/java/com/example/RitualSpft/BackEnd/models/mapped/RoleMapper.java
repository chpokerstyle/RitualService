package com.example.RitualSpft.BackEnd.models.mapped;

import com.example.RitualSpft.BackEnd.models.dto.RoleDto;
import com.example.RitualSpft.BackEnd.models.entity.RoleEntity;
import org.mapstruct.factory.Mappers;

public interface RoleMapper {
    RoleDto INSTANCE = Mappers.getMapper(RoleDto.class);

    RoleDto toDto(RoleEntity roleEntity);
    RoleEntity toEntity(RoleDto roleDto);
}
