package com.rushedstudio.domino.api.model.dto;

import lombok.Data;

@Data
public class LocationDTO {

    private Long id;
    private String streetAddress;
    private String homeNumber;
    private String postalCode;
    private CityDTO city;
    private CountryDTO country;
    private StateDTO state;
}
