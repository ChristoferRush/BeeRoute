package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.UserDto;
import com.rushedstudio.domino.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "account.id", target = "accountId")
    UserDto toUserDTO(User user);

    @Mapping(source = "accountId", target = "account.id")
    User toUser(UserDto userDto);

    List<UserDto> toUserDTOList(List<User> users);

    List<User> toUserList(List<UserDto> userDtoList);
}
