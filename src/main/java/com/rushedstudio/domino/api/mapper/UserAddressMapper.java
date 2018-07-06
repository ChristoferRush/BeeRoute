package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.UserAddressDto;
import com.rushedstudio.domino.domain.UserAddress;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserAddressMapper {

    UserAddressMapper INSTANCE = Mappers.getMapper(UserAddressMapper.class);

    UserAddressDto toUserAddressDTO(UserAddress userAddress);

    UserAddress toUserAddress(UserAddressDto userAddressDto);

    List<UserAddressDto> toUserAddressDTOList(List<UserAddress> userAddressList);

    List<UserAddress> toUserAddressList(List<UserAddressDto> userAddressDtoList);
}
