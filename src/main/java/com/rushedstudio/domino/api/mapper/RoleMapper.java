package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.RoleDTO;
import com.rushedstudio.domino.domain.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    @Mapping(source = "users", target = "users")
    RoleDTO roleToRoleDTO(Role role);
}
