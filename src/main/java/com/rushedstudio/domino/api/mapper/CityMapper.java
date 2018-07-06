package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.domain.City;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mappings({
            @Mapping(source = "state.id", target = "stateId"),
            @Mapping(source = "country.id", target = "countryId")
    })
    CityDto toCityDTO(City city);

    @InheritInverseConfiguration
    City toCity(CityDto cityDto);

    List<CityDto> toCityDtoList(List<City> cities);

    List<City> toCityList(List<CityDto> cityDtoList);
}
