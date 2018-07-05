package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.CountryDTO;
import com.rushedstudio.domino.domain.Country;
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
//        CountryMapper.class,
        LocationMapper.class,
        StateMapper.class,
        UserAddressMapper.class
})
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDTO toCountryDTO(Country country);

    Country toCountry(CountryDTO countryDTO);

    List<CountryDTO> toCountryDTOList(List<Country> countryList);

    List<Country> toCountryList(List<CountryDTO> countryDTOList);
}
