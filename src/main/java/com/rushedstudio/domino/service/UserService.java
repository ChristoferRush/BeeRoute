package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.api.model.list.UserListDTO;

public interface UserService {

    // get

    UserListDTO getAllUsers();

    UserDTO getUserById(Long userId);

    UserDTO getUserByUsername(String username);

    // delete

    void deleteUserById(Long userId);

    // ----------------------------
}
