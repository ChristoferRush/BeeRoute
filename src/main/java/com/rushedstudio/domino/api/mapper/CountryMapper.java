package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.CountryDTO;
import com.rushedstudio.domino.api.model.list.CountryListDTO;
import com.rushedstudio.domino.domain.Country;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDTO countryToCountryDTO(Country country);

    CountryListDTO countryListToCountryListDTO(List<CountryDTO> dto);
}
