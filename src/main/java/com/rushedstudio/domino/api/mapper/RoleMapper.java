package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.RoleDTO;
import com.rushedstudio.domino.api.model.UserDTO;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    @Mapping(source = "users", target = "users")
    RoleDTO roleToRoleDTO(Role role);

    Set<RoleDTO> roleListToRoleDTOList(Set<Role> roles);

    UserDTO userToUserDTO(User user);
}
