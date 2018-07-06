package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.domain.Country;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDto toCountryDTO(Country country);

    Country toCountry(CountryDto countryDto);

    List<CountryDto> toCountryDTOList(List<Country> countryList);

    List<Country> toCountryList(List<CountryDto> countryDtoList);
}
