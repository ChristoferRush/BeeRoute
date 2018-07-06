package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDto toAddressDTO(Address address);

    Address toAddress(AddressDto addressDto);

    List<AddressDto> toAddressDTOList(List<Address> addressList);

    List<Address> toAddressList(List<AddressDto> addressDtoList);
}
