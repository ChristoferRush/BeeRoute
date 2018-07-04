package com.rushedstudio.domino.api.model.dto;

import lombok.Data;

@Data
public class UserAddressDTO {

    private Long id;
    private UserDTO user;
    private AddressDTO address;
    private boolean main;
}
