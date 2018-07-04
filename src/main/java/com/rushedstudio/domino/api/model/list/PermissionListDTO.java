package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.PermissionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PermissionListDTO {

    private List<PermissionDTO> permissions;
}
