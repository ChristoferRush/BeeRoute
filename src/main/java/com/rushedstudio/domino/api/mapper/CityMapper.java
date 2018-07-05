package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.CityDTO;
import com.rushedstudio.domino.domain.City;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
        UserMapper.class,
        RoleMapper.class,
        AccountMapper.class,
        AddressMapper.class,
//        CityMapper.class,
        CountryMapper.class,
        LocationMapper.class,
        StateMapper.class,
        UserAddressMapper.class
})
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mapping(source = "state", target = "state")
    CityDTO toCityDTO(City city);

    City toCity(CityDTO cityDTO);

    List<CityDTO> toCity(List<City> cities);

    List<City> toCityList(List<CityDTO> cityDTOList);
}
