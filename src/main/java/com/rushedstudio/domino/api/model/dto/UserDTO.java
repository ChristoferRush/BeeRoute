package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rushedstudio.domino.api.model.list.UserAddressListDTO;
import com.rushedstudio.domino.domain.Account;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.domain.UserAddress;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private RoleDTO role;
    private AccountDTO account;
    @JsonIgnore
    private List<UserAddressDTO> userAddressList;
}
