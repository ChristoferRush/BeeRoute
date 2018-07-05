package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.RoleDTO;
import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.domain.User;
import com.rushedstudio.domino.tool.CycleAvoidingMappingContext;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
        UserMapper.class,
//        RoleMapper.class,
        AccountMapper.class,
        AddressMapper.class,
        CityMapper.class,
        CountryMapper.class,
        LocationMapper.class,
        StateMapper.class,
        UserAddressMapper.class
})
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleDTO toRoleDTO(Role role);

    Role toRole(RoleDTO roleDTO);

    List<RoleDTO> toRoleDTOList(List<Role> roleList);

    List<Role> toRoleList(List<RoleDTO> roleDTOList);
}
