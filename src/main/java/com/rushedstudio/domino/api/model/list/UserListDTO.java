package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.UserDTO;
import lombok.Data;

import java.util.List;

@Data
public class UserListDTO {

    private List<UserDTO> userDTOList;
}