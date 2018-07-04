package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rushedstudio.domino.api.model.list.AddressListDTO;
import com.rushedstudio.domino.api.model.list.LocationListDTO;
import com.rushedstudio.domino.domain.Address;
import com.rushedstudio.domino.domain.Country;
import com.rushedstudio.domino.domain.State;
import lombok.Data;

import javax.persistence.*;
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
