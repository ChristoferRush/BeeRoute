package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rushedstudio.domino.domain.Country;
import lombok.Data;

import java.util.List;

@Data
public class CityDTO {

    private Long id;
    private String name;
    private Country country;
    private StateDTO state;
    @JsonIgnore
    private List<AddressDTO> addressList;
}
