package com.rushedstudio.domino.api.model;

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
    private Role role;
}
