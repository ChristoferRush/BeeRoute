package com.rushedstudio.domino.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class CityDto {

    private Long id;
    private String name;
    private Short countryId;
    @JsonIgnoreProperties({"cityList"})
    private Long stateId;
    private List<AddressDto> addressList;
}
