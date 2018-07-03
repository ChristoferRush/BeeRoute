package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.mapper.UserMapper;
import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.api.model.list.UserListDTO;
import com.rushedstudio.domino.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // get

    @Override
    public UserListDTO getAllUsers() {
        UserListDTO dto = new UserListDTO();
        dto.setUserDTOList(UserMapper.INSTANCE.userListToUserDTOList(userRepository.findAll()));
        return dto;
    }

    @Override
    public UserDTO getUserById(Long userId) {
        return UserMapper.INSTANCE.userToUserDTO(userRepository.getOne(userId));
    }

    @Override
    public UserDTO getUserByUsername(String username) {
        return UserMapper.INSTANCE.userToUserDTO(userRepository.findUserByUsername(username));
    }

    // delete

    @Override
    public void deleteUserById(Long userId) {
        userRepository.delete(userRepository.getOne(userId));
    }
}
