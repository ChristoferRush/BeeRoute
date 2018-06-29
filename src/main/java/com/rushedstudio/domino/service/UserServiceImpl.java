package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.mapper.UserMapper;
import com.rushedstudio.domino.api.model.UserDTO;
import com.rushedstudio.domino.api.model.UserListDTO;
import com.rushedstudio.domino.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // get

    @Override
    public UserListDTO getAllUsers() {
        UserListDTO dto = new UserListDTO();
        dto.setUserDTOList(userRepository.findAll()
                .stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList())
        );
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
