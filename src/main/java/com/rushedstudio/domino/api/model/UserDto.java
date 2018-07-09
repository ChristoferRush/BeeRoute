package com.rushedstudio.domino.api.model;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private RoleDto role;
    private Long accountId;
    private List<UserAddressDto> userAddressList;
}
