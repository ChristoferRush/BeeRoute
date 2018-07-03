package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.PermissionDTO;
import com.rushedstudio.domino.domain.Permission;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionMapper {

    PermissionMapper INSTANCE = Mappers.getMapper(PermissionMapper.class);

    PermissionDTO permissionToPermissionDTO(Permission permission);

    List<PermissionDTO> permissionListToPermissionDTOList(List<Permission> permissions);
}