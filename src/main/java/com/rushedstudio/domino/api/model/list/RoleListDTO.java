package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.RoleDTO;
import lombok.Data;

import java.util.List;

@Data
public class RoleListDTO {

    private List<RoleDTO> roles;
}
