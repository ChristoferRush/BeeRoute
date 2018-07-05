package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);
}
