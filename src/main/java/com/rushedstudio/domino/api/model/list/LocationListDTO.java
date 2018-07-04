package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.LocationDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LocationListDTO {

    private List<LocationDTO> locations;
}
