package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.UserDTO;
import com.rushedstudio.domino.api.model.UserListDTO;
import com.rushedstudio.domino.domain.User;

public interface UserService {

    // get

    UserListDTO getAllUsers();

    UserDTO getUserById(Long userId);

    UserDTO getUserByUsername(String username);

    // delete

    void deleteUserById(Long userId);

    // ----------------------------
}
