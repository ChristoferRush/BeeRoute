package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.PermissionDto;
import com.rushedstudio.domino.domain.Permission;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionMapper {

    PermissionMapper INSTANCE = Mappers.getMapper(PermissionMapper.class);

    PermissionDto toPermissionDTO(Permission permission);

    Permission toPermission(PermissionDto permissionDto);

    List<PermissionDto> toPermissionDTOList(List<Permission> permissionList);

    List<Permission> toPermissionList(List<PermissionDto> permissionDtoList);
}
