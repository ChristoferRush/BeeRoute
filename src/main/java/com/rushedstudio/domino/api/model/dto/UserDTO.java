package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @JsonIgnoreProperties({"userList", "permissionList"})
    private RoleDTO role;
    @JsonIgnore
    private AccountDTO account;
    @JsonIgnore
    private List<UserAddressDTO> userAddressList;
}
