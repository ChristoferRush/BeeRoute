package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.CityDTO;
import com.rushedstudio.domino.domain.City;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    CityDTO cityToCityDTO(City city);

    List<CityDTO> cityListToCityDTO(List<City> cities);
}
