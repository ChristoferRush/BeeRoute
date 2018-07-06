package com.rushedstudio.domino.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rushedstudio.domino.domain.Country;
import lombok.Data;

import java.util.List;

@Data
public class CityDto {

    private Long id;
    private String name;
    private Country country;
    @JsonIgnoreProperties({"cityList"})
    private StateDto state;
    private List<AddressDto> addressList;
}
