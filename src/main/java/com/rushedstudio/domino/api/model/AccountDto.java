package com.rushedstudio.domino.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class AccountDto {

    private Long id;
    private String name;
    private String passwd;
    @JsonIgnoreProperties({"accountId", "userAddressList"})
    private UserDto user;
}
