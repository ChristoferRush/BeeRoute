package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rushedstudio.domino.api.model.list.RoleListDTO;
import com.rushedstudio.domino.domain.Role;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class PermissionDTO {

    private Long id;
    private String name;
    @JsonIgnore
    private List<RoleDTO> roleList;
}
