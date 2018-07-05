package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.UserAddressDTO;
import com.rushedstudio.domino.domain.UserAddress;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
        UserMapper.class,
        RoleMapper.class,
        AccountMapper.class,
        AddressMapper.class,
        CityMapper.class,
        CountryMapper.class,
        LocationMapper.class,
        StateMapper.class,
//        UserAddressMapper.class
})
public interface UserAddressMapper {

    UserAddressMapper INSTANCE = Mappers.getMapper(UserAddressMapper.class);

    UserAddressDTO toUserAddressDTO(UserAddress userAddress);

    UserAddress toUserAddress(UserAddressDTO userAddressDTO);

    List<UserAddressDTO> toUserAddressDTOList(List<UserAddress> userAddressList);

    List<UserAddress> toUserAddressList(List<UserAddressDTO> userAddressDTOList);
}
