package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.AddressDTO;
import com.rushedstudio.domino.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDTO addressToAddressDTO(Address address);

    Address addressDTOToAddress(AddressDTO addressDTO);

    List<AddressDTO> addressListToAddressDTOList(List<Address> addressList);

    List<Address> addressDTOListToAddressList(List<AddressDTO> addressDTOList);
}
