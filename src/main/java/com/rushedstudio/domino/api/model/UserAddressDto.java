package com.rushedstudio.domino.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class UserAddressDto {

    private Long id;
    @JsonIgnoreProperties("userAddressList")
    private UserDto user;
    @JsonIgnoreProperties("userAddressList")
    private AddressDto address;
    private boolean main;
}
