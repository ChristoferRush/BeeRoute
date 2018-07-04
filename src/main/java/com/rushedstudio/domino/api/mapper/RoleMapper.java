package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.RoleDTO;
import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleDTO roleToRoleDTO(Role role);

    Role roleDTOToRole(RoleDTO roleDTO);

    List<RoleDTO> roleListToRoleDTOList(List<Role> roleList);

    List<Role> roleDTOListToRoleList(List<RoleDTO> roleDTOList);
}
