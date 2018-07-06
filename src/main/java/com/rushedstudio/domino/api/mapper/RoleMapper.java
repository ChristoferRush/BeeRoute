package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.RoleDto;
import com.rushedstudio.domino.domain.Role;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    @Mapping(source = "permission.id", target = "permissionId")
    RoleDto toRoleDTO(Role role);

    Role toRole(RoleDto roleDto);

    List<RoleDto> toRoleDTOList(List<Role> roleList);

    List<Role> toRoleList(List<RoleDto> roleDtoList);
}
