package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.PermissionDTO;
import com.rushedstudio.domino.domain.Permission;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
        UserMapper.class,
        RoleMapper.class,
        AccountMapper.class,
        AddressMapper.class,
        CityMapper.class,
        CountryMapper.class,
        LocationMapper.class,
        StateMapper.class,
        UserAddressMapper.class
})
public interface PermissionMapper {

    PermissionMapper INSTANCE = Mappers.getMapper(PermissionMapper.class);

    PermissionDTO toPermissionDTO(Permission permission);

    Permission toPermission(PermissionDTO permissionDTO);

    List<PermissionDTO> toPermissionDTOList(List<Permission> permissionList);

    List<Permission> toPermissionList(List<PermissionDTO> permissionDTOList);
}
