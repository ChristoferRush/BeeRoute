package com.rushedstudio.domino.api.model;

import com.rushedstudio.domino.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class RoleListDTO {

    private List<RoleDTO> roles;
}
