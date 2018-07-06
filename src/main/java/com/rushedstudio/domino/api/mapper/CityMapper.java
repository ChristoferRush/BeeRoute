package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.domain.City;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mapping(source = "state", target = "state")
    CityDto toCityDTO(City city);

    City toCity(CityDto cityDto);

    List<CityDto> toCity(List<City> cities);

    List<City> toCityList(List<CityDto> cityDtoList);
}
