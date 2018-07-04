package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);

    List<UserDTO> userListToUserDTOList(List<User> users);

    List<User> userDTOListToUserList(List<UserDTO> userDTOList);
}
