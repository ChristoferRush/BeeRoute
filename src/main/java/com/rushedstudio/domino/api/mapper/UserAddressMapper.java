package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.UserAddressDTO;
import com.rushedstudio.domino.api.model.list.RoleListDTO;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.domain.UserAddress;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserAddressMapper {

    UserAddressMapper INSTANCE = Mappers.getMapper(UserAddressMapper.class);

    UserAddressDTO userAddressToUserAddressDTO(UserAddress userAddress);

    UserAddress userAddressDTOToUserAddress(UserAddressDTO userAddressDTO);

    List<UserAddressDTO> userAddressListToUserAddressDTOList(List<UserAddress> userAddressList);

    List<UserAddress> userAddressDTOListToUserAddressList(List<UserAddressDTO> userAddressDTOList);
}
