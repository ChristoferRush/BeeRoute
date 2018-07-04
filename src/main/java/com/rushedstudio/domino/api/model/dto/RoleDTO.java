package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rushedstudio.domino.api.model.list.UserListDTO;
import com.rushedstudio.domino.domain.Permission;
import com.rushedstudio.domino.domain.User;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class RoleDTO {

    private Long id;
    private String name;
    @JsonIgnore
    private List<UserDTO> userList;
    private List<PermissionDTO> permissionList;
}
