package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rushedstudio.domino.domain.Role;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    @JsonIgnoreProperties("users")
    private Role role;
}
