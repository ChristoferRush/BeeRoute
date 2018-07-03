package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rushedstudio.domino.api.model.list.LocationListDTO;
import lombok.Data;

@Data
public class CityDTO {

    private Long id;
    private String name;
    private CountryDTO country;
    private StateDTO state;
    @JsonIgnore
    private LocationListDTO locations;
}
