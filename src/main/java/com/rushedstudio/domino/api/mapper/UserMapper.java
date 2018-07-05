package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.UserDTO;
import com.rushedstudio.domino.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
//        UserMapper.class,
        RoleMapper.class,
        AccountMapper.class,
        AddressMapper.class,
        CityMapper.class,
        CountryMapper.class,
        LocationMapper.class,
        StateMapper.class,
        UserAddressMapper.class
})
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toUserDTO(User user);

    User toUser(UserDTO userDTO);

    List<UserDTO> toUserDTOList(List<User> users);

    List<User> toUserList(List<UserDTO> userDTOList);
}
