package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.UserDTO;
import com.rushedstudio.domino.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO uderToUserDTO(User user);
}
