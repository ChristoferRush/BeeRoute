package com.rushedstudio.domino.api.model.dto;

import lombok.Data;

@Data
public class AccountDTO {

    private Long id;
    private String name;
    private String passwd;
    private UserDTO user;
}
