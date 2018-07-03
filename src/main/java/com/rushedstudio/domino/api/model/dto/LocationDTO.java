package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class LocationDTO {

    private Long id;
    private String streetAddress;
    private String homeNumber;
    private String postalCode;
    @JsonIgnoreProperties({"states", "cities", "locations"})
    private CountryDTO country;
    @JsonIgnoreProperties({"cities", "locations"})
    private StateDTO state;
    @JsonIgnoreProperties({"locations"})
    private CityDTO city;
}
