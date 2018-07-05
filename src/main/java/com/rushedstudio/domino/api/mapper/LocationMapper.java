package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.LocationDTO;
import com.rushedstudio.domino.domain.Location;
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
        CountryMapper.class,
//        LocationMapper.class,
        StateMapper.class,
        UserAddressMapper.class
})
public interface LocationMapper {

    LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);

    LocationDTO toLocationDTO(Location location);

    Location toLocation(LocationDTO locationDTO);

    List<LocationDTO> toLocationDTOList(List<Location> locationList);

    List<Location> toLocationList(List<LocationDTO> locationDTOList);
}
