package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.PermissionDTO;
import lombok.Data;

import java.util.List;

@Data
public class PermissionListDTO {

    private List<PermissionDTO> permissions;
}
