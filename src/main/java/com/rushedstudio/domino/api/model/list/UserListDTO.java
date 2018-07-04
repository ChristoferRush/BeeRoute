package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserListDTO {

    private List<UserDTO> users;
}
