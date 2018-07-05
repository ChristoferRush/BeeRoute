package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.AddressDTO;
import com.rushedstudio.domino.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
        UserMapper.class,
        RoleMapper.class,
        AccountMapper.class,
//        AddressMapper.class,
        CityMapper.class,
        CountryMapper.class,
        LocationMapper.class,
        StateMapper.class,
        UserAddressMapper.class
})
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDTO toAddressDTO(Address address);

    Address toAddress(AddressDTO addressDTO);

    List<AddressDTO> toAddressDTOList(List<Address> addressList);

    List<Address> toAddressList(List<AddressDTO> addressDTOList);
}
