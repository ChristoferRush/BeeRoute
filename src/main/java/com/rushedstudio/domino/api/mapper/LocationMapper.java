package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.LocationDto;
import com.rushedstudio.domino.domain.Location;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocationMapper {

    LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);

    LocationDto toLocationDTO(Location location);

    Location toLocation(LocationDto locationDto);

    List<LocationDto> toLocationDTOList(List<Location> locationList);

    List<Location> toLocationList(List<LocationDto> locationDtoList);
}
