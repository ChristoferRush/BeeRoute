package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class AccountDTO {

    private Long id;
    private String name;
    private String passwd;
    @JsonIgnoreProperties({"account", "userAddressList"})
    private UserDTO user;
}
