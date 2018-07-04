package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.LocationDTO;
import com.rushedstudio.domino.domain.Location;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocationMapper {

    LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);

    LocationDTO locationToLocationDTO(Location location);

    Location locationDTOToLocation(LocationDTO locationDTO);

    List<LocationDTO> locationListToLocationDTOList(List<Location> locationList);

    List<Location> locationDTOListToLocationList(List<LocationDTO> locationDTOList);
}
